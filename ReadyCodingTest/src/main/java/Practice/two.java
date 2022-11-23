package Practice;

import java.util.*;

public class two {
    public int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {
        int answer = -1;
        Map<List<Integer>, Integer> taxTable =new HashMap<>();

        //threshold 미만일 경우 세금 0
        if (threshold == 0) {
            taxTable.put(new ArrayList<>(Arrays.asList(0,0)), 0);
        } else {
            taxTable.put(new ArrayList<>(Arrays.asList(0,threshold-1)), 0);
        }

        // 세율 표
        for (int i = 0; i<maxratio-minratio+1;i++){
            if(i == maxratio-minratio){
                taxTable.put(new ArrayList<>(Arrays.asList(threshold+ranksize*(i+1),1000000000)), maxratio);
            } else{
                taxTable.put(new ArrayList<>(Arrays.asList(threshold+ranksize*i,threshold+ranksize*(i+1)-1)), minratio + i);
            }
        }



        for (int i = 0; i < months; i++) {
            List<Integer> key = new ArrayList<>();
            int moneyAssume = 0;

            //백의 자리 숫자 미만 버림
            if (money % 100 != 0) {
                moneyAssume = (money / 100) * 100;
            } else {
                moneyAssume = money;
            }

            for (List<Integer> keyTemp : taxTable.keySet()) {
                if (moneyAssume >= keyTemp.get(0) && moneyAssume <= keyTemp.get(1)) {
                    key.add(keyTemp.get(0));
                    key.add(keyTemp.get(1));
                    break;
                }
            }

            money -= moneyAssume*(taxTable.get(key) *0.01);

        }

        answer = money;

        return answer;
    }

    public static void main(String[] args) {
//        int sol = new two().solution(12345678, 10, 20, 250000, 10000000, 4);
//        int sol = new two().solution(1000000000, 50, 99, 100000, 0, 6);
        int sol = new two().solution(123456789, 0, 0, 1, 0, 360);

        System.out.println(sol);
    }
}
