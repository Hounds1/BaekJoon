package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        int k = array[0] % array[1];

        for (int i = 0; i < array[2] - 1; i++) {
            k *= 10;
            k %= array[1];
        }

        k *= 10;

        System.out.println(k/array[1]);
    }
}
