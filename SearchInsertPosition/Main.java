package SearchInsertPosition;


public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int targetIndex = new Solution().searchInsert(nums, target);

        System.out.println("The target " + target + " should be at index " + targetIndex);
    }
}
