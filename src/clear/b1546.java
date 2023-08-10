package clear;

import java.util.Scanner;

public class b1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subs = Integer.parseInt(sc.nextLine());

        String[] scores = sc.nextLine().split(" ");
        int[] array = new int[subs];

        for (int i = 0; i < subs; i++) {
            array[i] = Integer.parseInt(scores[i]);
        }

        int max = 0;
        for (int i : array) {
            if (i > max)
                max = i;
        }

        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += ((double) array[i] / max) * 100;
        }

        System.out.println(total / subs);
    }
}
