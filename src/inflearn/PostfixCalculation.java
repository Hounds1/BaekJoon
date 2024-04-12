package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixCalculation {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        char[] targets = bufferedReader.readLine().toCharArray();

        bufferedReader.close();

        for (char target : targets) {

            if (Character.isDigit(target)) {
                stack.push(Character.getNumericValue(target));
            } else {
                if (target == '+') {
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    stack.push(n2 + n1);
                } else if (target == '-') {
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    stack.push(n2 - n1);
                } else if (target == '*') {
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    stack.push(n2 * n1);
                } else if (target == '/') {
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    stack.push(n2 / n1);
                }
            }
        }

        System.out.println(stack.get(0));
    }
}
