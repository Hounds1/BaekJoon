package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindMaxSumValueIntoBoard {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());
        int[][] board = new int[range][range];

        for (int i = 0; i < range; i++) {
            int[] array = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            board[i] = array;
        }

        int max = 0;
        for (int i = 0; i < range; i++) {
            int value = 0;
            int dual = 0;

            for (int j = 0; j < range; j++) {
                value += board[i][j];
                dual += board[j][i];
            }

            max = Math.max(max, value);
            max = Math.max(max, dual);
        }

        int value = 0;
        for (int i = 0; i < board.length - 1; i++) {
            value += board[i][i];
        }

        max = Math.max(max, value);

        value = 0;

        for (int i = board.length - 1; i >= 0; i--) {
            value += board[i][i];
        }

        max = Math.max(max, value);

        System.out.println(max);
    }
}
