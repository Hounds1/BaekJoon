package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedDecimalNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();

        String[] targets = bufferedReader.readLine().split(" ");

        for (String target : targets) {
            int decimal = isDecimal(target);

            if (decimal != 0) {
                System.out.print(decimal + " ");
            }
        }
    }

    private static int isDecimal(String target) {
        String[] split = target.split("");

        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            builder.append(split[i]);
        }

        int value = Integer.parseInt(builder.toString());

        if (value == 1) {
            return 0;
        }

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return 0;
            }
        }

        return value;
    }
}
