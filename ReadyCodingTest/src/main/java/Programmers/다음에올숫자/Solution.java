package Programmers.다음에올숫자;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int gap = 0;

        if (common[2] - common[1] == common[1] - common[0]) {
            gap = common[2] - common[1];
            answer = common[common.length - 1] + gap;
        } else {
            gap = common[2]/common[1];
            answer = common[common.length - 1] * gap;
        }

        return answer;
    }

    public static void main(String[] args) {
        int sol = new Solution().solution(new int[] {1,2,3,4});
        int sol2 = new Solution().solution(new int[] {2,4,8});
        System.out.println(sol);
        System.out.println(sol2);
    }
}
