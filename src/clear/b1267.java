package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1267 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dummy = sc.nextLine();

        System.out.println(validateYOrM(sc.nextLine()));
    }

    private static String validateYOrM(final String recordStr) {
        int[] records = Arrays.stream(recordStr.split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        int y = youngSick(records);
        int m = minSick(records);

        if (y > m)
            return "M " + m;
        else if (y == m)
            return "Y M " + y;
        else
            return "Y " + y;
    }

    private static int youngSick(final int[] records) {

        int sum = 0;
        for (int n : records) {
            int base = (n / 30) + 1;

            sum += base * 10;
        }

        return sum;
    }

    private static int minSick(final int[] records) {

        int sum = 0;
        for (int n : records) {
            int base = (n / 60) + 1;

            sum += base * 15;
        }

        return sum;
    }
}
