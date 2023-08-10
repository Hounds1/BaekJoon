package clear;

import java.util.Scanner;

public class b25304 {
    public static String solution() {
        Scanner sc = new Scanner(System.in);

        int parsedTotal = Integer.parseInt(sc.nextLine());
        int range = Integer.parseInt(sc.nextLine());

        int amount = 0;

        for(int i = 0; i < range; i++) {
            String str = sc.nextLine();
            String[] array = str.split(" ");

            amount += Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
        }

        if (parsedTotal == amount)
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
