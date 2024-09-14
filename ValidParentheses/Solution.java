package ValidParentheses;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isOpeningBracket = currentChar == '{' || currentChar == '(' || currentChar == '[';
            char lastChar = ' ';
            if(!bracketStack.isEmpty()) lastChar = bracketStack.lastElement();
            boolean isCorrectClosingBracket = (currentChar == '}' && lastChar == '{') || (currentChar == ')' && lastChar == '(') || (currentChar == ']' && lastChar == '[');

            if (isOpeningBracket) {
                bracketStack.push(currentChar);
            } else if (isCorrectClosingBracket){
                bracketStack.pop();
            }

            System.out.println(bracketStack);
        }
        return bracketStack.isEmpty();
    }
}
