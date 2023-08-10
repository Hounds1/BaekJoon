package clear;

import java.util.Scanner;

public class b10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = Integer.parseInt(sc.nextLine());

        int[] arr = new int[range];

        String[] strArr = sc.nextLine().split(" ");

        for (int i = 0; i < range; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int target = Integer.parseInt(sc.nextLine());
        int result = 0;

        for (int t : arr) {
            if (t == target)
                result++;
        }

        System.out.println(result);
    }
}
