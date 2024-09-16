package TwoSum;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] targetIndices = new Solution().twoSum(nums, target);

        System.out.println(Arrays.toString(targetIndices));

    }
}
