import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int end = arguments[1];

        boolean[] composite = new boolean[end + 1];
        if (end >= 0) composite[0] = true;
        if (end >= 1) composite[1] = true;

        for (int i = 2; i * i <= end; i++) {
            if (!composite[i]) {
                for (int j = i * i; j <= end; j += i) {
                    composite[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        final int start = arguments[0];
        int max = Math.max(start, 2);
        for (int i = max; i <= end; i++) {
            if(!composite[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}