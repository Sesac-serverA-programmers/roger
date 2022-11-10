import java.util.*;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {

        /////////code/////////

        //map에 저장 후 key-value 비교
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            HashSet<Integer> sangeun = new HashSet<>();

            if (n == 0 && m == 0) {
                System.out.println(count);
                return;
            }

            for (int i = 0; i < n; i++) {
                sangeun.add(sc.nextInt());
            }

            for (int i = 0; i < m; i++) {
                boolean contains = sangeun.contains(sc.nextInt());
                if (contains) {
                    count++;
                }
            }
        }

        /////////code/////////
    }
}