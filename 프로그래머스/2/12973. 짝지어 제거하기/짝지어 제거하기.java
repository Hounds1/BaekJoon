import java.util.*;

class Solution
{
    public int solution(String s) {

        Stack<Character> stack = new Stack<>();
        boolean able = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            Character peek = stack.peek();
            if (peek == c) {
                stack.pop();
            } else stack.push(c);
        }

        if (!stack.isEmpty()) able = false;

        return able ? 1 : 0;
    }
}