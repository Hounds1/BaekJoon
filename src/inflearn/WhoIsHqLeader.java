package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhoIsHqLeader {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        int[][] students = new int[range][5];
        for (int i = 0; i < range; i++) {
            students[i] = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bufferedReader.close();

        int max = Integer.MIN_VALUE;
        int answer = 0;

        for (int i = 0; i < range; i++) {
            int count = 0;
            for (int j = 0; j < range; j ++) {
                for (int k = 0; k < 5; k++) {
                    if (students[i][k] == students[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i + 1;
            }
        }

        System.out.println(answer);
    }
}
