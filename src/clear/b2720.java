package clear;

import java.util.Scanner;

public class b2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            System.out.println(counting(Integer.parseInt(sc.nextLine())));
        }

        sc.close();
    }

    public static String counting(int change) {
        StringBuilder sb = new StringBuilder();

        sb.setLength(0);

        double[] coins = {25, 10, 5, 1};

        int[] count = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            count[i] = (int)(change / coins[i]);
            change %= coins[i];
        }

        for (int i = 0; i < count.length; i++) {
            sb.append(String.valueOf(count[i]));
            sb.append(" ");
        }

        return sb.toString();
    }
}
