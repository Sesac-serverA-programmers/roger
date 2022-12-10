package codeUp.CU1093;

import java.util.*;

public class Main {

    public static void solution(List<Integer> a) {
        HashMap<Integer,Integer> studentlist = new HashMap<>();
        for (int i = 1; i < 24; i++) {
            studentlist.put(i,0);
        }

        for (Integer studentNumb : a) {
            if(studentlist.containsKey(studentNumb)){
                studentlist.put(studentNumb,studentlist.get(studentNumb)+1);
            }
        }

        for (int i = 1; i < 24; i++) {
            System.out.print(studentlist.get(i));
            if(i!=23){
                System.out.print(" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        solution(a);
    }
}
