package Programmers.잘라서배로저장하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120913
import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int ceil = (int) Math.ceil((double) my_str.length() / (double) n);
        String[] answer = new String[ceil];

        for (int i = 0; i < ceil; i++) {
            String text = "";
            int slash = i * n;
            for (int j = slash; j < slash+n; j++) {
                if (j == my_str.length()) {
                    break;
                }
                text += my_str.charAt(j);
            }
            answer[i] = text;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] sol = new Solution().solution("abc1Addfggg4556b", 6);
        String[] sol2 = new Solution().solution("abcdef123", 3);

        for (String s : sol) {
            System.out.println(s);
        }
        for (String s : sol2) {
            System.out.println(s);
        }

    }
}
