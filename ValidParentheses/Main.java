package ValidParentheses;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean isValid = solution.isValid("([])");
        System.out.println("Is Valid String: " + isValid);
    }
}
