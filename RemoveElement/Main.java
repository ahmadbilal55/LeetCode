package RemoveElement;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array

        System.out.println("Original: "+ Arrays.toString(nums));
        int[] expectedNums = new int[]{0,1,4,0,3}; // The expected answer with correct length
        int val = 2;
        Solution solution = new Solution();
        int k = solution.removeElement(nums,val); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("Expected: "+ Arrays.toString(expectedNums));
        System.out.println("Result: "+ Arrays.toString(nums));
    }
}
