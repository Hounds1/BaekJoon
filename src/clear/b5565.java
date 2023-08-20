package clear;

import java.util.Scanner;

public class b5565 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int range = 9;

        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += sc.nextInt();
        }

        System.out.println(total - sum);
    }
}
