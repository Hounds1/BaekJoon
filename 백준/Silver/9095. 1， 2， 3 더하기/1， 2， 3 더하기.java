import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            System.out.println(dp(Integer.parseInt(bufferedReader.readLine())));
        }
    }

    public static int dp(int num) {
        if (num == 1) return 1;
        if (num == 2) return 2;
        if (num == 3) return 4;

        return dp(num - 1) + dp(num - 2) + dp(num - 3);
    }
}