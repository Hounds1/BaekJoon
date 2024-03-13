package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1598 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        int total = Math.abs((array[0] - 1) / 4 - (array[1] - 1)/ 4) + Math.abs((array[0] - 1) % 4 - (array[1] - 1) % 4);

        System.out.println(total);
    }
}
