package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MentoringMatches {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int heads = ranges[0], tests = ranges[1];

        int[][] board = new int[tests][heads];
        for (int i = 0; i < tests; i++) {
            board[i] = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bufferedReader.close();

        int answer = 0;

        for (int i = 1; i <= heads; i++) {
            for (int j = 1; j <= heads; j++) {
                int count = 0;

                for (int k = 0; k < tests; k++) {
                    int pi = 0, pj = 0;

                    for (int s = 0; s < heads; s++) {
                        if (board[k][s] == i) {
                            pi = s;
                        }
                        if (board[k][s] == j) {
                            pj = s;
                        }
                    }

                    if (pi < pj) {
                        count++;
                    }
                }

                if (count == tests) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
