package 모의고사;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.max;

public class Main {
    public int[] solution(int[] answers) {
//        int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();


        temp.add(supo1(answers));
        temp.add(supo2(answers));
        temp.add(supo3(answers));


        int max = max(temp);

        for (int i = 0 ; i<temp.size();i++) {
            if (temp.get(i) == max) {
                answer.add(i+1);
            }
        }

        int[] as = answer.stream().mapToInt(i -> i).toArray();

        return as;
    }

    public int supo1(int [] answers){
        int score = 0;

        for(int i = 0; i<answers.length;i++){
            if (i % 5 == 0 && answers[i]==1) {
                score++;
            } else if(i % 5 == 1 && answers[i]==2){
                score++;
            } else if(i % 5 == 2 && answers[i]==3){
            score++;
            } else if(i % 5 == 3 && answers[i]==4){
                score++;
            } else if(i % 5 == 4 && answers[i]==5){
                score++;
            }
        }
        return score;
    }

    public int supo2(int [] answers){
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if ((i % 8 == 0 || i % 8 == 2 || i % 8 == 4 || i % 8 == 6) && answers[i] == 2) {
                score++;
            } else if (i % 8 == 1 && answers[i] == 1) {
                score++;
            } else if (i % 8 == 3 && answers[i] == 3) {
                score++;
            }else if (i % 8 == 5 && answers[i] == 4) {
                score++;
            }else if (i % 8 == 7 && answers[i] == 5) {
                score++;
            }
        }

        return score;
    }public int supo3(int [] answers){
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if ((i % 10 == 0 || i % 10 == 1) && answers[i] == 3) {
                score++;
            } else if ((i % 10 == 2 || i % 10 == 3) && answers[i] == 1) {
                score++;
            } else if ((i % 10 == 4 || i % 10 == 5) && answers[i] == 2) {
                score++;
            } else if ((i % 10 == 6 || i % 10 == 7) && answers[i] == 4) {
                score++;
            } else if ((i % 10 == 8 || i % 10 == 9) && answers[i] == 5) {
                score++;
            }
        }
        return score;
    }


    public static void main(String[] args) {

//        int[] sol1 = new Main().solution(new int[]{1,2,3,4,5});
        int[] sol2 = new Main().solution(new int[]{1,3,2,4,2});
//        System.out.println(sol1);
    }
}
