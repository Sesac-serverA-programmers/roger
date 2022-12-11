package Programmers.종이자르기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120922

class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        return M*(N-1)+(M-1);
    }

    public static void main(String[] args) {
        int sol = new Solution().solution(2,2);
        int sol2 = new Solution().solution(2,5);
        int sol3 = new Solution().solution(1,1);

        System.out.println(sol);
        System.out.println(sol2);
        System.out.println(sol3);
    }
}
