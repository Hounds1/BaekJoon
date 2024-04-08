package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfContinuityNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        int range = (target / 2) + 1;
        int[] arr = new int[range];

        for (int i = 0; i < range; i++) {
            arr[i] = i + 1;
        }

        int pointer1 = 0, temp = 0, count = 0;

        for (int pointer2 = 0; pointer2 < range; pointer2++) {
            temp += arr[pointer2];
            if (temp == target) {
                count++;
            }

            while (temp >= target) {
                temp -= arr[pointer1++];

                if (temp == target) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
