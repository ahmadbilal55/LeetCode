package FindTheIndexOfTheFirstOccurrenceInAString;


public class Main {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int indexOfNeedle = new Solution().strStr(haystack, needle);
        int indexOfNeedleWithKMP = new Solution().strStrWithKMP(haystack, needle);

        System.out.println("The needle '" + needle + "' is at " + indexOfNeedle);
        System.out.println("The needle '" + needle + "' is at " + indexOfNeedleWithKMP + " with KMP algorithm");
    }
}
