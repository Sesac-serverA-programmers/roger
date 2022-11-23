package 해시.완주하지못한선수;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    //시간초과
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> answerList = new ArrayList<>();

        for(int i = 0; i<participant.length;i++){
            answerList.add(participant[i]);
        }

        for(int i = 0; i<completion.length;i++){
            answerList.remove(completion[i]);

        }

        answer += answerList.get(0);


        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> answerList = new HashMap<>();

        for(int i = 0; i<participant.length;i++){

            answerList.put(participant[i], answerList.containsKey(participant[i])? answerList.get(participant[i])+1 : 1);

        }

        for(int i = 0; i<completion.length;i++){
            answerList.put(completion[i],answerList.get(completion[i])-1);
        }

        for(String s : answerList.keySet()){
            if(answerList.get(s)==1){
                answer += s;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
//        String sol = new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
        String sol2 = new Solution().solution2(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
        System.out.println(sol2);
    }
}
