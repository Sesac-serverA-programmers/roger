package 동적계획법;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class N으로표 {
    boolean flag;
    public int solution(int N, int number) {
        int answer = 0;

        bfs(N,number,0,0);

        if (!flag) {
            return -1;
        }
        return answer;
    }

    public void bfs(int N, int number, int count, int result){

        Queue<Integer> q = new LinkedList<>();
        int[] list = {0,1,2,3,4};

        q.add(N);
        int temp = N;

        while (!q.isEmpty()){

            for (int i = 0; i < 5; i++) {
                int param = list[i];

                if (param == 0) {
                    result = q.poll()*10 + N;
                    q.add(result);
                    count++;
                } else if(param==1){
                    result = q.poll() + N;
                    q.add(result);
                    count++;
                } else if(param==2){
                    result = q.poll() - N;
                    q.add(result);
                    count++;
                } else if(param==3){
                    result = q.poll() / N;
                    q.add(result);
                    count++;
                } else if(param==4){
                    result = q.poll() * N;
                    q.add(result);
                    count++;
                }



            }


            if(count>7){
                return;
            }else if (result==number){
                flag = true;
                return;
            }
        }


    }
}
