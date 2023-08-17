package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b2457 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        sc.close();
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += (int) Math.pow((double) array[i], 2);
        }

        System.out.println(total % 10);
    }
}
