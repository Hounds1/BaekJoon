package clear;

import java.util.Scanner;

public class b2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());
        int calc = range * 2 - 1;

        int routine = 0;
        int stars = 1;
        int blank = range - 1;

        while(true) {
            if (routine == Math.ceil((double) calc /2))
                break;

            for (int i = 0; i < blank; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            System.out.println(" ");
            stars += 2;
            routine++;
            blank--;
        }

        stars -= 4;
        routine -= 1;

        int newStars = stars;
        int newBlank = 1;

        while(true) {
            if (routine == calc)
                break;

            for (int i = 0; i < newBlank; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < newStars; i++) {
                System.out.print("*");
            }

            System.out.println(" ");
            newStars -= 2;
            routine++;
            newBlank++;
        }
    }
}
