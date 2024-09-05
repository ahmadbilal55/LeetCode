package RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Points to the next position for non-val elements

        // Iterate through all elements in nums
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, overwrite at index k and increment k
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Move the pointer to the next index
            }
        }

        // Return the count of non-val elements, which is k
        return k;
    }

}
