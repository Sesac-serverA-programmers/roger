import java.util.Scanner;

public class 수면장애 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp;
        int number = 0;
        for (int i = 0;; i++) {
            int d = 0;
            number++;
            temp = number;
            do {
                temp /= 10;
                d++;
            } while (temp>0);
            n -= d;
            if (n <= 0) {
                for (int j = 0; j > n; j--) {
                    number /= 10;
                }
                System.out.println(number%10);
                break;
            }
        }
    }
}


/**
 * 1234567891011121314151617181920
 */
