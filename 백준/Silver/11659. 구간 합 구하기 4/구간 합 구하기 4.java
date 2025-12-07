import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len = arguments[0];
        final int localLen =  arguments[1];

        int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] table = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            table[i] = nums[i - 1] + table[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localLen; i++) {
            int[] targets = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(table[targets[1]] - table[targets[0] - 1]).append("\n");
        }

        System.out.println(sb);
    }
}