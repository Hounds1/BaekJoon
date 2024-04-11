package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class CaseOfSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        int range = ranges[0], target = ranges[1];

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < range; i++) {
            for (int j = i + 1; j < range; j++) {
                for (int k = j + 1; k < range; k++) {
                    treeSet.add(numbers[i] + numbers[j] + numbers[k]);
                }
            }
        }

        int answer = -1;
        int count = 0;

        for (Integer integer : treeSet) {
            count++;

            if (count == target) {
                System.out.println(integer);
                return;
            }
        }

        System.out.println(answer);
    }
}
