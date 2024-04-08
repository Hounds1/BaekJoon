package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SalesHistories {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int days = ranges[0];
        int sequence = ranges[1];

        int[] sales = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < days - sequence; i++) {
            int temp = 0;

            for (int j = i ; j < i + sequence; j++) {
                temp += sales[j];
            }

            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}
