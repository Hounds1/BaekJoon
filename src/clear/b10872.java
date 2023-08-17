package clear;

import java.util.Scanner;

public class b10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        sc.close();

        System.out.println(fac(target, 1));
    }

    public static int fac(int target, int result) {
        if (target == 0)
            return result;

        result *= target;
        target--;

        return fac(target, result);
    }
}
