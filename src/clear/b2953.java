package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b2953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = 5;
        int rank = 0;
        int score = 0;

        for (int i = 0; i < range; i++) {
            int sum = 0;
            int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int k : array)
                sum += k;

            if (sum > score) {
                score = sum;
                rank = i + 1;
            }
        }

        System.out.println(rank + " " + score);
    }
}
