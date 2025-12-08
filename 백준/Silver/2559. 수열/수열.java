import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int len =  arguments[0];
        final int term = arguments[1];

        int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long max = Long.MIN_VALUE;
        int idx = 0;
        while (idx <= len - term) {
            long total = 0;

            for (int i = idx; i < idx + term; i++) {
                total += nums[i];
            }

            if (total > max) max = total;
            idx++;
        }

        System.out.println(max);
    }
}