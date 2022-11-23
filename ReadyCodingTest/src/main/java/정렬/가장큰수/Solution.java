package 정렬.가장큰수;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    List<Long> answerList = new ArrayList<>();

    public String solution(int[] numbers) {
        String answer = "";

        int l=numbers.length;

        String[] sNumbers = new String[l];
        int[] temp = new int[l];

        for(int i = 0; i<l; i++){
            sNumbers[i] = String.valueOf(numbers[i]);
        }

        boolean[] visited = new boolean[l];


        permutaion(numbers,temp,visited,0,l,l);


        long max = 0;
        for (int i = 0; i < answerList.size(); i++) {
            if (max < answerList.get(i)) {
                max = answerList.get(i);
            }
        }

        answer = String.valueOf(max);

        return answer;
    }

    public void permutaion(int[] input, int[] output,boolean[] visited, int depth, int n, int r){

        if(depth == r){
            String s="";
            for(int i =0; i<output.length;i++){
                s += String.valueOf(output[i]);
            }
            answerList.add(Long.valueOf(s));
            return;
        }
        for(int i =0; i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                output[depth] = input[i];
                permutaion(input, output,visited,depth+1, n, r);
                visited[i]=false;
            }
        }
    }

    public static void main(String[] args) {
//        String sol = new Solution().solution(new int[]{6, 10, 2});
//        String sol2 = new Solution().solution(new int[]{3, 30, 34, 5, 9});
//        String sol3 = new Solution().solution(new int[]{48, 484, 533});
//        String sol4 = new Solution().solution(new int[]{34, 3444, 32, 3222}); // 런타임에러 : answerList int -> long으로 타입 변경 후 해결
//        String sol5 = new Solution().solution(new int[]{979, 97, 978, 81, 818, 817});
//        String sol6 = new Solution().solution(new int[]{0,0,0}); // 0 나옴 -> 000나와야함.
        String sol7 = new Solution().solution(new int[]{0,40,8});

//        System.out.println(sol);
//        System.out.println(sol2);
//        System.out.println(sol3);
//        System.out.println(sol4);
//        System.out.println(sol5);
//        System.out.println(sol6);
        System.out.println(sol7);

    }
}

//FIXME
// 런타임에러, 시간초과
