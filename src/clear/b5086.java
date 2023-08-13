package clear;

import java.util.Scanner;

public class b5086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] split = sc.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            if (a == 0 && b == 0)
                break;

            if (a < b && b % a == 0)
                System.out.println("factor");
            else if (a > b && a % b == 0)
                System.out.println("multiple");
            else
                System.out.println("neither");
        }

        sc.close();
    }
}
