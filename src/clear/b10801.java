package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] targets = sc.nextLine().split(" ");

        int range = Integer.parseInt(targets[0]);
        int routine = Integer.parseInt(targets[1]);

        int[] bucket = new int[range];
        Arrays.fill(bucket, 0);

        for (int i = 0; i < routine; i++) {
            String[] plan = sc.nextLine().split(" ");
            int start = Integer.parseInt(plan[0]) - 1;
            int end = Integer.parseInt(plan[1]) - 1;
            int ballNum = Integer.parseInt(plan[2]);

            for (int j = start; j <= end; j++) {
                bucket[j] = ballNum;
            }
        }

        for (int i : bucket) {
            System.out.print(i + " ");
        }
    }
}
