package Programmers.문자열밀기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120921

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        Deque<String> stringDeque = new LinkedList<>();
        String text = "";

        for (int i = 0; i < A.length(); i++) {
            stringDeque.add(String.valueOf(A.charAt(i)));
        }

        while (!text.equals(B)) {

            text = "";
            for (int i = 0; i < stringDeque.size(); i++) {
                text += stringDeque.peek();
                String poll = stringDeque.poll();
                stringDeque.add(poll);
            }

            if (answer > A.length()) {
                answer = -1;
                break;
            } else {
                String temp = stringDeque.pollLast();
                stringDeque.addFirst(temp);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int sol = new Solution().solution("hello","ohell");
        int sol2 = new Solution().solution("apple","elppa");

        System.out.println(sol);
        System.out.println(sol2);
    }
}
