import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments
                = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len =  arguments[0];
        final int target = arguments[1];

        int[] table = new int[len];
        int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.arraycopy(nums, 0, table, 0, len);

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            int temp = table[i];

            if (temp == target) {
                cnt++;
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                temp += table[j];

                if (temp == target) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}