package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class b1158 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringJoiner sj = new StringJoiner(", ");
        try {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= array[0]; i++) {
                queue.add(i);
            }

            while (!queue.isEmpty()) {
                for (int i = 0; i < array[1] - 1; i++) {
                    queue.offer(queue.poll());
                }
                sj.add(String.valueOf(queue.poll()));
            }

            System.out.println("<" + sj + ">");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
