package clear;

import java.util.Scanner;

public class b1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            int target = Integer.parseInt(sc.nextLine());
            if (target == 0) {
                System.out.println(1 + " " + 0);
                continue;
            }

            int start = 0;
            int end = 1;
            for (int j = 2; j <= target; j++) {
                int temp = end;
                end = start + end;
                start = temp;
            }
            System.out.println(start + " " + end);
        }

        sc.close();
    }
}
