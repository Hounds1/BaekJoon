import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int num1 = arguments[0];
        final int num2 = arguments[1];

        int gcd = 0;
        if (num1 > num2) {
            gcd = gcd(num1, num2);
        } else {
            gcd = gcd(num2, num1);
        }

        System.out.println(gcd);
        System.out.println((num1 * num2) / gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}