import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len = arguments[0];
        final int target = arguments[1];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= len; i++) {
            queue.add(i);
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < target - 1; j++) {
                queue.add(queue.poll());
            }

            joiner.add(String.valueOf(queue.poll()));
        }

        System.out.println("<" + joiner + ">");
    }
}