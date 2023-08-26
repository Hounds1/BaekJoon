package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        Arrays.sort(array);

        int index = 1;
        int total = 0;
        while (index != range + 1) {
            for (int i = 0; i < index; i++) {
                total += array[i];
            }

            index++;
        }

        System.out.println(total);
    }
}
