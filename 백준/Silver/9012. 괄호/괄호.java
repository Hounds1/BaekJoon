import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        final char left = '(';

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            stack.clear();
            String line = bufferedReader.readLine();

            boolean print = true;
            for (int j = 0; j < line.length(); j++) {
                char target = line.charAt(j);
                if (target == left) stack.push(target);
                else {
                    if (stack.isEmpty()) {
                        print = false;
                        System.out.println("NO");
                        break;
                    } else stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                print = false;
                System.out.println("NO");
            }

            if (print) System.out.println("YES");
        }
    }
}