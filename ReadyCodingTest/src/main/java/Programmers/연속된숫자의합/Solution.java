package Programmers.연속된숫자의합;
//https://school.programmers.co.kr/learn/courses/30/lessons/120923

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        if (total % num == 0) {
            int middle = total / num;
            int x = num / 2;

            for (int i = 0; i < num; i++) {
                answer[i] = middle - x;
                x--;
            }
        } else{
            int start = (total - (((num-1) * num) / 2)) / num;
            for (int i = 0; i < num; i++) {
                answer[i] = start+i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] sol = new Solution().solution(3, 12);
        int[] sol2 = new Solution().solution(5, 15);
        int[] sol3 = new Solution().solution(4, 14);
        int[] sol4 = new Solution().solution(5, 5);

        System.out.println(Arrays.toString(sol));
        System.out.println(Arrays.toString(sol2));
        System.out.println(Arrays.toString(sol3));
        System.out.println(Arrays.toString(sol4));
    }
}
