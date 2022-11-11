package 탐욕법.체육복;

import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] check = new int[n];
        Arrays.fill(check,1);

        for(int r : reserve){
            check[r-1] = 2;
        }

        for(int l : lost){
            if(check[l-1]==2){
                check[l-1] = 1;
            }
            else if(check[l-1]==1){
                check[l-1] = 0;
            }

        }

        for(int i = 0 ; i<n; i++){
            if(check[i]==2){
                if(i==0 && check[i+1]==0){
                    check[i]=1;
                    check[i+1]=1;
                } else if(i == n-1 && check[i-1]==0){
                    check[i] = 1;
                    check[i-1] = 1;
                } else if(i>0 && i<n-1){
                    if(check[i-1] == 0){
                        check[i]=1;
                        check[i-1] =1;
                    } else if(check[i+1]==0){
                        check[i]=1;
                        check[i+1]=1;
                    }
                }
            }
        }

        for(int c : check){
            if(c==1||c==2){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int sol = new Solution().solution(5,new int[]{2,4}, new int[]{1,3,5});
        int sol2 = new Solution().solution(5,new int[]{2,4}, new int[]{3});
        int sol3 = new Solution().solution(3,new int[]{3}, new int[]{1});

        System.out.println(sol);
        System.out.println(sol2);
        System.out.println(sol3);
    }
}
