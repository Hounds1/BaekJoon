package clear;

import java.util.Scanner;

public class b2558 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += Integer.parseInt(sc.nextLine());
        }

        sc.close();

        System.out.println(sum);
    }
}
