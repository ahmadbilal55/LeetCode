package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Assuming the first string is the common prefix
        String commonPrefix = strs[0];

        for (String s : strs) {
            while (s.indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
    }
}
