package 이분탐색;

import java.util.Arrays;
import java.util.OptionalInt;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;

        int tl = times.length;

        int[] temp = times.clone();

        while(n != 0){

            int min = Arrays.stream(temp).min().getAsInt();

            for (int i = 0; i < tl; i++) {
                if (temp[i] == min) {
                    answer += temp[i];
                    n--;
                    temp[i] = times[i];
                } else {
                    temp[i] -= min;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long sol = new Immigration().solution(6, new int[]{7, 10});
        System.out.println(sol);
    }
}

/**
 * 7, 10
 * 2명
 * 7, 3(=10-7)
 * 3명
 * 4(=7-3), 10
 * 4명
 * .
 * .
 * .
 */