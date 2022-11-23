package 정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];

        //int형 배열을 String형 배열로 바꿈
        for (int i=0; i<nums.length; i++)
            nums[i] = numbers[i] + "";

        //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String ans = "";
        for (int i=0; i<numbers.length; i++)
            ans += nums[i];



        return ans.charAt(0) == '0' ? "0" : ans;
    }

    public static void main(String[] args) {
//        String sol = new Solution().solution(new int[]{6, 10, 2});
        String sol2 = new Solution().solution(new int[]{3, 30, 34, 5, 9});
        String sol3 = new Solution().solution(new int[]{48, 484, 533});
//        String sol4 = new Solution().solution(new int[]{34, 3444, 32, 3222}); // 런타임에러 : answerList int -> long으로 타입 변경 후 해결
//        String sol5 = new Solution().solution(new int[]{979, 97, 978, 81, 818, 817});
//        String sol6 = new Solution().solution(new int[]{0,0,0}); // 0 나옴 -> 000나와야함.
//        String sol7 = new Solution().solution(new int[]{0,40,8});

//        System.out.println(sol);
        System.out.println(sol2);
        System.out.println(sol3);
//        System.out.println(sol4);
//        System.out.println(sol5);
//        System.out.println(sol6);
//        System.out.println(sol7);

    }
}
