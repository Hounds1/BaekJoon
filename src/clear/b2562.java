package clear;

import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = 9;
        int[] arr = new int[range];

        for (int i = 0; i < range; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < range; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}
