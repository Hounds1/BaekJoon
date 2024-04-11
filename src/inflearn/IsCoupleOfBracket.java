package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IsCoupleOfBracket {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> stack = new Stack<>();

        for (String s : bufferedReader.readLine().split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else if (s.equals(")")) {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
