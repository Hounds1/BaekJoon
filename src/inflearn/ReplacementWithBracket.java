package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReplacementWithBracket {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] targets = bufferedReader.readLine().split("");
        Stack<String> stack = new Stack<>();

        for (String target : targets) {
            if (target.equals(")")) {
                while (!stack.pop().equals("("));
            } else {
                stack.push(target);
            }
        }

        for (String s : stack) {
            System.out.print(s);
        }
    }
}
