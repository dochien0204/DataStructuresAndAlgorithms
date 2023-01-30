package problem10;

import java.util.Stack;

public class ParenthesesExpression {

    public static void main(String[] args) {
        String text = "(((()))";

        Stack<Character> st1 = new Stack<>();
        for(int i = 0; i < text.length(); i++) {
            st1.push(text.charAt(i));
        }
        Stack<Character> st2 = new Stack<>();
        boolean isValid = true;
        while (!st1.isEmpty()) {
            Character paren = st1.pop();
            if (paren == ')') {
                st2.push(paren);
            } else {
                if (st2.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    st2.pop();
                }
            }
            if(st1.isEmpty() && !st2.isEmpty()) {
                isValid = false;
            }
        }

        System.out.println("isValid : " + isValid);

    }
}
