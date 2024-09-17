package ValidPalindrome;


public class Main {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        boolean isPalindrome = new Solution().isPalindrome(str);

        System.out.println("Is string '" + str + "' palindrome: " + isPalindrome);
    }
}
