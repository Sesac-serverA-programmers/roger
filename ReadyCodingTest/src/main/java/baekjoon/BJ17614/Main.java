package baekjoon.BJ17614;

import java.util.Scanner;

public class Main {

    public int samukgu(int n) {
        int clap = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x != 0) {
                int a  = x%10;
                if (a != 0 && a % 3 == 0) {
                    clap++;
                }
                x /= 10;
            }
        }
        return clap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solution = new Main().samukgu(sc.nextInt());
        System.out.println(solution);
    }
}
