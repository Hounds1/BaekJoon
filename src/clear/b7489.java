package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b7489 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < range; i++) {
            System.out.println(find(Integer.parseInt(bufferedReader.readLine())));
        }

        bufferedReader.close();
    }

    private static String find(int target) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= target; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

            while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
                factorial = factorial.divide(BigInteger.TEN);
            }

            factorial = factorial.mod(BigInteger.TEN.pow(10));
        }

        return String.valueOf(factorial.mod(BigInteger.TEN).intValue());
    }
}
