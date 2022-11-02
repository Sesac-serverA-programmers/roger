class Solution {

    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }


    public static void main(String[] args) {
        int[] numb1 = {1,1,1,1,1};
        int[] numb2 = {4,1,2,1};

        int solution1 = new Solution().solution(numb1, 3);
        int solution2 = new Solution().solution(numb2, 4);
        System.out.println(solution1);
        System.out.println(solution2);
    }

}
//참조 : https://hyojun.tistory.com/entry/Programmers-%ED%83%80%EA%B2%9F-%EB%84%98%EB%B2%84-Java