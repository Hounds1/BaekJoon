package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1284 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String nextLine = sc.nextLine();

            if (nextLine.equals("0"))
                break;

            System.out.println(maker(nextLine));
        }
    }

    private static int maker(final String target) {
        int[] intArr = Arrays.stream(target.split("")).mapToInt(Integer::parseInt).parallel().toArray();

        int sum = (intArr.length - 1) + 2;

        for (int n : intArr) {
            if (n == 0)
                sum += 4;
            else if(n == 1)
                sum += 2;
            else
                sum += 3;
        }

        return sum;
    }
}
