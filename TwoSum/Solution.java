package TwoSum;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int possibleTarget = target- nums[i];
            if (numsMap.containsKey(possibleTarget)) {
                return new int[]{i, numsMap.get(possibleTarget)};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
