import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());

            if (b == 1) {
                System.out.println(1);
                continue;
            }

            int[] arr = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = j + 1;
            }

            int[] dp = dp(arr, a, 0);
            System.out.println(dp[b - 1]);
        }
    }

    public static int[] dp(int[] arr, int target, int round) {
        if (target == round) return arr;

        int[] after = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = i; j >= 0; j--) {
                num += arr[j];
            }

            after[i] = num;
        }

        return dp(after, target, round + 1);
    }
}