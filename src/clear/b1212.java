package clear;

import java.util.Scanner;

public class b1212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] split = sc.nextLine().split("");
        for (String s : split)
            sb.append(octToDecimal(s));

        String result = sb.toString();

        int index = result.indexOf("1");
        if (index == -1) {
            System.out.println(0);
            return;
        }

        if (index > 0)
            System.out.println(result.substring(index));
        else
            System.out.println(result);
    }

    private static String octToDecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);

        String binary = Integer.toBinaryString(decimal);

        int paddingLength = 3 - binary.length();
        if (paddingLength > 0) {
            StringBuilder padding = new StringBuilder();
            for (int i = 0; i < paddingLength; i++) {
                padding.append("0");
            }
            binary = padding + binary;
        }

        return binary;
    }
}
