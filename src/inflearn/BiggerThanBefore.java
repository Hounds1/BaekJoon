package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggerThanBefore {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();

        int[] targets = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int pointer1 = 0;

        while (pointer1 < targets.length - 1) {
            if (pointer1 == 0) {
                System.out.print(targets[pointer1] + " ");
            }

            if (targets[pointer1] < targets[pointer1 + 1]) {
                System.out.print(targets[pointer1 + 1] + " ");
            }

            pointer1 += 1;
        }
    }
}
