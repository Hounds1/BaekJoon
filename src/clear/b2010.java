package clear;

import java.util.Scanner;

public class b2010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum - range + 1);
    }
}
