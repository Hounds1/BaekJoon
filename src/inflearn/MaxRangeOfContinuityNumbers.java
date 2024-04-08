package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxRangeOfContinuityNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int range = ranges[0];
        int change = ranges[1];

        int[] intArr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        int p1 = 0, count = 0, result = 0;

        for (int p2 = 0; p2 < range; p2++) {
            if (intArr[p2] == 0) {
                count++;
            }

            while (count > change) {
                if (intArr[p1] == 0) {
                    count--;
                }
                p1++;
            }

            result = Math.max(result, p2 - p1 + 1);
        }

        System.out.println(result);
    }
}
