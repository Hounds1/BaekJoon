import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(Math.abs(nums[0] - nums[1]) + 2);
        }
    }
}