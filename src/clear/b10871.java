package clear;

import java.util.Scanner;

public class b10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        int range = Integer.parseInt(arr1[0]);
        int target = Integer.parseInt(arr1[1]);

        String[] arr2 = sc.nextLine().split(" ");
        int[] targetArr = new int[range];

        for (int i = 0; i < range; i++) {
            targetArr[i] = Integer.parseInt(arr2[i]);
        }

        for (int i : targetArr) {
            if (i < target)
                System.out.print(i + " ");
        }
    }
}
