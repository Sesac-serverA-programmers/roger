package 이분탐색;

import java.util.Arrays;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;

        int tl = times.length;

        //처음에 모두 들어갔을 경우
        n -= tl;
        answer += Arrays.stream(times).sum();

        while(n != 0){



        }



        return answer;
    }

    public static void main(String[] args) {
        long sol = new Immigration().solution(6, new int[]{7, 10});
        System.out.println(sol);
    }
}
