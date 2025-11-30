import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String dot = ".";
        final char leftS = '(';
        final char rightS = ')';
        final char leftB = '[';
        final char rightB = ']';

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals(dot)) break;

            Stack<Character> stack = new Stack<>();
            boolean stabled = true;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == leftS || c == leftB) stack.push(c);
                else if (c == rightS || c == rightB) {
                    if (stack.isEmpty()) {
                        stabled = false;
                        break;
                    }

                    Character pop = stack.pop();
                    if (c == rightB && pop != leftB) {
                        stabled = false;
                        break;
                    } else if (c == rightS && pop != leftS) {
                        stabled = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) stabled = false;

            sb.append(stabled ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}