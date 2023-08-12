package clear;

import java.util.Scanner;

public class b2745 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        String target = split[0];
        int arithmetic = Integer.parseInt(split[1]);

        System.out.println(convertToDecimal(target, arithmetic));
    }

    public static int convertToDecimal(String target, int arithmetic) {
        return Integer.parseInt(target, arithmetic);
    }
}
