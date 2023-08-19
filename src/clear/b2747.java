package clear;

import java.util.Scanner;

public class b2747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        sc.close();

        System.out.println(find(0, 1, 1, target));
    }

    public static int find(int r1, int r2, int count, int target) {
        if (count == target)
            return r2;

        int temp = r1 + r2;
        r1 = r2;
        r2 = temp;

        count++;

        return find(r1, r2, count, target);
    }
}
