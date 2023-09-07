package clear;

import java.math.BigInteger;
import java.util.Scanner;

public class b1247 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int range = Integer.parseInt(sc.nextLine());

            BigInteger bigInteger = new BigInteger("0");
            for (int j = 0; j < range; j++) {
                String input = sc.nextLine().trim();

                if (!input.isEmpty())
                    bigInteger = bigInteger.add(new BigInteger(input));
            }

            String stringFromBi = bigInteger.toString();

            if (stringFromBi.equals("0"))
                sb.append("0").append("\n");
            else if (stringFromBi.startsWith("-"))
                sb.append("-").append("\n");
            else
                sb.append("+").append("\n");
        }

        System.out.println(sb);
    }
}
