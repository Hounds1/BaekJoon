package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b3046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();

        System.out.println((2 * array[1]) - array[0]);
    }
}
