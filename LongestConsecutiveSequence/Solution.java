package LongestConsecutiveSequence;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }

        int longestSequence = 0;
        int startingPoint;
        for (int num : nums) {
            if (!mySet.contains(num - 1)) {
                startingPoint = num;
                int currentSequence = 1;
                while (mySet.contains(startingPoint + 1)) {
                    startingPoint++;
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        return longestSequence;
    }
}
