import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int num1 = arguments[0];
            int num2 = arguments[1];
            if (num1 == 1 || num2 == 1) {
                sb.append(Math.max(num1, num2)).append("\n");
                continue;
            }

            sb.append((num1 * num2) / gcd(num1, num2)).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}