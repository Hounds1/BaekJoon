package clear;

import java.util.Scanner;

public class b2576 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 10000;
        int sum = 0;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.isEmpty())
                break;

            int num = Integer.parseInt(nextLine);

            if (num % 2 != 0) {
                if (num < min) {
                    min = num;
                }
                sum += num;
            }
        }

        if (sum != 0)
            System.out.println(sum);

        System.out.println(min == 10000 ? -1 : min);
    }
}
