package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SuperMario {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] targets = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bufferedReader.close();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= targets[0]; i++) {
            queue.add(i);
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < targets[1] - 1; i++) {
                queue.offer(queue.poll());
            }

            answer = queue.poll();
        }

        System.out.println(answer);
    }
}
