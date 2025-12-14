import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int localLen = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localLen; i++) {
            int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (ranges[0] == ranges[1]) {
                sb.append(arguments[ranges[0] - 1]).append("\n");
                continue;
            }

            int n = 0;
            for (int j = ranges[0] - 1; j <= ranges[1] - 1; j++) {
                n += arguments[j];
            }

            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }
}