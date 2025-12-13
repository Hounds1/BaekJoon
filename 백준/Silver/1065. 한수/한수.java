import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());

        int cnt = 0;
        for (int i = 1; i <= target; i++) {
            if (i <= 99) {
                cnt++;
                continue;
            }

            String s = String.valueOf(i);
            int[] arguments = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();

            final int len = arguments.length;

            int before = arguments[len - 1] - arguments[len - 2];
            boolean bool = true;
            for (int j = len - 2; j >= 1; j--) {
                if (arguments[j] - arguments[j - 1] != before) {
                    bool = false;
                    break;
                }
            }

            if (bool) cnt++;
        }

        System.out.println(cnt);
    }
}