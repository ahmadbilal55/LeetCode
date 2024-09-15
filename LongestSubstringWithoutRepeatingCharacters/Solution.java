package LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        if (s.isEmpty()) return 0;
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
        int longestStreak = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (str.indexOf(String.valueOf(c)) != -1) {
                str.setLength(0);
                i++;
                str.append(s, i, j);
            } else {
                str.append(c);
                j++;
            }
            longestStreak = Math.max(longestStreak,str.length());
        }
        return longestStreak;
    }
}
