package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        String[] arr = sc.nextLine().split(" ");

        int[] newArr = new int[range];

        for (int i = 0; i < range; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(newArr);
        int min = newArr[0];
        int max = newArr[range - 1];

        System.out.println(min + " " + max);
    }
}
