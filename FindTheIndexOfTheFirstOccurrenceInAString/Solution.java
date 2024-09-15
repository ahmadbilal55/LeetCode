package FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStrWithKMP(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int[] lps = new int[needle.length()];
        lps[0] = 0;
        int i = 1;
        int prevLPS = 0;
        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(prevLPS)) {
                lps[i] = prevLPS + 1;
                prevLPS += 1;
                i += 1;
            } else if (prevLPS == 0) {
                lps[i] = 0;
                i += 1;
            } else {
                prevLPS = lps[prevLPS - 1];
            }
        }

        i = 0;
        int j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i += 1;
                j += 1;
            } else if (j == 0) {
                i += 1;
            } else {
                j = lps[j - 1];
            }
            if (j == needle.length()) {
                return i - needle.length();
            }
        }
        return -1;
    }
}
