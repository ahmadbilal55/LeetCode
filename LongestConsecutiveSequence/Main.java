package LongestConsecutiveSequence;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 100, 4, 200, 3};

        int solution = new Solution().longestConsecutive(nums);

        System.out.println("The longest sequence in " + Arrays.toString(nums) + " is " + solution);
    }
}
