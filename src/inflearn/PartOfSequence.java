package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PartOfSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int range = ranges[0];
        int target = ranges[1];

        int[] intArr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        int p1 = 0, temp = 0, count = 0;

        for (int p2 = 0; p2 < range; p2++) {
            temp += intArr[p2];

            if (temp == target) {
                count++;
            }

            while (temp >= target) {
                temp -= intArr[p1++];

                if (temp == target) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
