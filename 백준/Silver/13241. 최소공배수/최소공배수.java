import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        final long num1 = arguments[0];
        final long num2 = arguments[1];

        long gcd = gcd(num1, num2);
        System.out.println((num1 * num2) / gcd);
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}