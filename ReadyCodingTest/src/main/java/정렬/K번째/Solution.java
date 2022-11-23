package 정렬.K번째;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int x = 0; x<commands.length;x++){
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            List<Integer> temp = new ArrayList<>();

            for(int y=i; y<=j;y++){
                temp.add(array[y-1]);
            }

            temp.sort(Comparator.naturalOrder());

            answer[x] = temp.get(k-1);

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] sol = new Solution().solution(new int []{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        System.out.println(sol);
    }

}
