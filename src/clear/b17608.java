package clear;

import java.util.Scanner;

public class b17608 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int[] ints = new int[range];
        for (int i = 0; i < range; i++) {
            ints[i] = sc.nextInt();
        }

        int count = 0;
        int top = 0;

        for (int i = range - 1; i >= 0; i--) {
            if (ints[i] > top) {
                count++;
                top = ints[i];
            }
        }

        System.out.println(count);
    }
}
