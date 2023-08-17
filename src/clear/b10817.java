package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10817 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        String[] split = str.split(" ");

        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        System.out.println(array[1]);
    }
}
