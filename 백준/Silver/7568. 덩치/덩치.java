import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[][] table =  new int[len][2];

        for (int i = 0; i < len; i++) {
            int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            table[i][0] = arguments[0];
            table[i][1] = arguments[1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int rank = 1;
            for (int j = 0; j < len; j++) {
                if (j == i) continue;

                if (table[j][0] > table[i][0] && table[j][1] > table[i][1]) rank++;
            }

            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }
}