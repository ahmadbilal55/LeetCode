package LongestSubstringWithoutRepeatingCharacters;



public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = new Solution().lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
