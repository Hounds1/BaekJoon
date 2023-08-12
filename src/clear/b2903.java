package clear;

import java.util.Scanner;

public class b2903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = Integer.parseInt(sc.nextLine());

        if (target == 1) {
            System.out.println((int) Math.pow(2 + target, 2));
        } else if (target == 0) {
            System.out.println(4);
        } else {
            int calc = (int) Math.pow(2, target) + 1;

            System.out.println((int) Math.pow(calc, 2));
        }

        sc.close();
    }
}
