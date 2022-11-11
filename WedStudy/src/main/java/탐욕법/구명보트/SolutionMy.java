package 탐욕법.구명보트;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class SolutionMy {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int peoplesafed = 0;


        int n = people.length;

        Stack<Integer> boat = new Stack<>();
        Stack<Integer> index = new Stack<>();
        boolean[] check = new boolean[n];

        for(int i =0; i<n; i++){
            if(check[i]==false){
                index.add(i);
                boat.add(people[i]);
                check[i]=true;
                if(boat.size()==2){
                    int b = boat.pop();
                    index.pop();
                    int a = boat.pop();
                    int ai = index.pop();
                    int total = a+b;
                    if(total>limit){
                        check[i]=false;
                        boat.add(a);
                        index.add(ai);
                        if(i==n-1){
                            boat.pop();
                            answer++;
                            peoplesafed++;
                            i = index.pop();
                        }
                    } else {
                        answer++;
                        peoplesafed++;
                        peoplesafed++;
                        i = ai;
                    }
                }else if(boat.size()==1&&peoplesafed==n-1){
                    answer++;
                    i = index.pop();
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int sol = new SolutionMy().solution(new int[]{70, 50, 80, 50}, 100);
//        int sol2 = new Solution().solution(new int[]{70, 80, 50}, 100);
//        int sol2 = new Solution().solution(new int[]{50, 50, 50}, 100);

        System.out.println(sol);
    }
}

//FIXME
// <반례>
// 입력값 〉	[40, 50, 150, 160], 200
// 기댓값 〉	2
// 실행 결과 〉	실행한 결괏값 3이 기댓값 2과 다릅니다.
// ------------------------------------------
// <이유>
// (40,150), (50), (160)으로 결과값이 3으로 나온다.
// 최소값과 최대값의 개념이 코드에 적용되지 않아서 틀림.
