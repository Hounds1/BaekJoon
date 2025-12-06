import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len1 = arguments[0];
        final int len2 = arguments[1];

        char[][] table = new char[len1][len2];
        for (int i = 0; i < len1; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < len2; j++) {
                table[i][j] = line.charAt(j);
            }
        }

        final char hasGuard = 'X';

        int noGuardRow = 0;
        for (int i = 0; i < len1; i++) {
            boolean needGuard = true;

            for (int j = 0; j < len2; j++) {
                if (table[i][j] == hasGuard) {
                    needGuard = false;
                    break;
                }
            }

            if (needGuard) noGuardRow++;
        }

        int noGuardCol = 0;
        for (int i = 0; i < len2; i++) {
            boolean needGuard = true;

            for (int j = 0; j < len1; j++) {
                if (table[j][i] == hasGuard) {
                    needGuard = false;
                    break;
                }
            }

            if (needGuard) noGuardCol++;
        }

        System.out.println(Math.max(noGuardRow, noGuardCol));
    }
}