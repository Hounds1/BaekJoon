package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LaserCutter {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine();
        bufferedReader.close();

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (target.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
