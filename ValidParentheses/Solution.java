package ValidParentheses;

import java.util.Stack;

class Solution {
    // Method to check if a string of brackets is valid
    public boolean isValid(String s) {
        // Initialize a stack to keep track of opening brackets
        Stack<Character> bracketStack = new Stack<>();

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Get the current character from the string
            char currentChar = s.charAt(i);

            // Check if the current character is an opening bracket
            boolean isOpeningBracket = currentChar == '{' || currentChar == '(' || currentChar == '[';

            // Initialize a variable to hold the last character in the stack, set to space initially
            char lastChar = ' ';
            // If the stack is not empty, get the top element (last inserted opening bracket)
            if (!bracketStack.isEmpty()) lastChar = bracketStack.lastElement();

            // Check if the current character is a correct closing bracket for the top element of the stack
            boolean isCorrectClosingBracket =
                    (currentChar == '}' && lastChar == '{') ||
                            (currentChar == ')' && lastChar == '(') ||
                            (currentChar == ']' && lastChar == '[');

            // If it's an opening bracket, push it onto the stack
            if (isOpeningBracket) {
                bracketStack.push(currentChar);
            }
            // If it's a correct closing bracket, pop the last opening bracket from the stack
            else if (isCorrectClosingBracket) {
                bracketStack.pop();
            }
            // If neither, return false as the string is invalid
            else {
                return false;
            }
        }
        // If the stack is empty at the end, all brackets were matched, so return true
        return bracketStack.isEmpty();
    }
}
