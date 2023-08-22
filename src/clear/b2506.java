package clear;

import java.util.Scanner;

public class b2506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int total = 0;
        int score = 1;
        for (int i = 0; i < range; i++) {
            if (sc.nextInt() == 0) {
                score = 1;
            } else {
                total += score;
                score++;
            }
        }

        System.out.println(total);
    }
}
