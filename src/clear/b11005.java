package clear;

import java.util.Scanner;

public class b11005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int target = Integer.parseInt(split[0]);
        int base = Integer.parseInt(split[1]);

        System.out.println(convertToBase(target, base));

        sc.close();
    }

    public static String convertToBase(int decimalNumber, int base) {
        StringBuilder sb = new StringBuilder();
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            sb.insert(0, symbols.charAt(remainder));
            decimalNumber /= base;
        }

        return sb.toString();
    }
}
