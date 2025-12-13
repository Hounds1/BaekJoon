import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(dp(N));
    }

    public static int dp(int N) {
        int a = 1;
        int b = 2;

        if (N == 1) return a;
        if (N == 2) return b;

        for (int i = 3; i <= N; i++) {
            int val = (a + b) % 15746;
            a = b;
            b = val;
        }

        return b;
    }
}