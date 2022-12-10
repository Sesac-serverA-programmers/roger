package Programmers.옹알이_1;
// 옹알이(1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120956

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    List<String> list = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));


    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            String tmp = "";
            for (String l : list) {
                if(s.contains(l)){
                    tmp += l;
                }
            }
            if (tmp.length() == s.length()) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int sol = new Main().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa","mawyeoo","yemawooye"});
        System.out.println(sol);
    }
}
