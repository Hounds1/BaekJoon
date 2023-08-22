package clear;

import java.util.Scanner;

public class b7567 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split("");

        int sum = 10;
        String before = split[0];

        for (int i = 1; i < split.length; i++) {
            String after = split[i];
            if (after.equals(before)) {
                sum += 5;
                before = after;
            } else {
                sum += 10;
                before = after;
            }
        }

        System.out.println(sum);
    }
}
