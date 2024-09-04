package RemoveDuplicatesFromSortedArray;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,2,2,2,3,4,4,5,5,5}; // Input array
        int[] expectedNums = new int[]{1,2,3,4,5}; // The expected answer with correct length

        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
