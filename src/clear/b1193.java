package clear;

import java.util.Scanner;

public class b1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int target = sc.nextInt();
        int vertical = 1;
        while (target > vertical) {
            target -= vertical;
            vertical++;
        }

        int numerator = 0;
        int denominator = 0;
        if (vertical % 2 == 0) {
            numerator = target;
            denominator = vertical - target + 1;
        } else {
            numerator = vertical - target + 1;
            denominator = target;
        }

        sb.append(numerator);
        sb.append("/");
        sb.append(denominator);

        System.out.println(sb.toString());
    }
}
