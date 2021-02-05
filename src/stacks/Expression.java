package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    // iterate the string and get each characters at a time
    // when we reach the closing bracket, we have to look at previous opening bracket and make sure they match
    // so, we need to go backwards
    // if it is opening or left bracket, we need to push it to the top of our stack
    // if we get a regular character (1, space, or whatever), we ignore it
    // when we get to the closing bracket, we need to pop the character on the top of the stack and compare it with the current character
    // if they match we go forward and keep repeating it until we get to the end of the string.
    // if they don't match, we immediately stop and return false from our method.
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
