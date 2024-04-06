package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());

        if (target == 0) {
            System.out.println("0");
            return;
        }

        BigInteger origin = BigInteger.valueOf(target);
        for (int i = target - 1; i >= 1; i--) {
            BigInteger after = BigInteger.valueOf(i);
            origin = origin.multiply(after);
        }

        int count = 0;

        String[] split = origin.toString().split("");

        int range = split.length;

        for (int i = range - 1; i >= 0; i--) {
            if (split[i].equals("0")) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
