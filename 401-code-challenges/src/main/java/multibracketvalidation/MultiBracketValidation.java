package multibracketvalidation;

import stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (c ==  "[".charAt(0) || c ==  "{".charAt(0) || c ==  "(".charAt(0)) {
                stack.push(c);
            } else if (c ==  "]".charAt(0) || c ==  "}".charAt(0) || c ==  ")".charAt(0)) {
                if (stack.peek() == null) {
                    return false;
                } else if ((c == "]".charAt(0) && stack.peek() == "[".charAt(0)) ||
                        (c == "}".charAt(0) && stack.peek() == "{".charAt(0)) ||
                        (c == ")".charAt(0) && stack.peek() == "(".charAt(0))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.peek() == null;
    }
}
