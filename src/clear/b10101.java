package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = 3;
        int[] array = new int[range];

        for (int i = 0; i < range; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(array);

        System.out.println(find(array[0], array[1], array[2]));
    }

    public static String find(final int a,  final int b, final int c) {
        int total = a + b + c;

        if (total == 180 && a == b && b == c)
            return "Equilateral";
        else if (total == 180 && a != b && b != c)
            return "Scalene";
        else if (total != 180)
            return "Error";
        else
            return "Isosceles";
    }
}
