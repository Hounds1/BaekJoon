package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1051 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int range1 = ranges[0];
        final int range2 = ranges[1];

        int[][] board =  new int[range1][range2];

        for (int i = 0; i < range1; i++) {
            int[] vals = Arrays.stream(bufferedReader.readLine().split("")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < range2; j++) {
                board[i][j] = vals[j];
            }
        }

        final int maxLen = Math.min(range1, range2);

        for (int l = maxLen; l >= 1; l--) {
            for (int r = 0; r + l - 1 < range1; r++) {
                for (int c = 0; c + l - 1 < range2; c++) {
                    int point1 = board[r][c];
                    int point2 = board[r][c + l - 1];
                    int point3 =  board[r + l - 1][c];
                    int point4 =  board[r + l - 1][c + l - 1];

                    if (point1 == point2 && point2 == point3 && point3 == point4) {
                        System.out.println(l * l);
                        return;
                    }
                }
            }
        }
    }
}
