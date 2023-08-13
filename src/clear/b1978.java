package clear;

import java.util.Scanner;

public class b1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");

        int count = 0;
        for (int i = 0; i < range; i++) {
            if (isPrime(Integer.parseInt(split[i])))
                count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int target) {
        if (target == 1)
            return false;

        for (int i = 2; i * i <= target; i++) {
            if (target % i == 0)
                return false;
        }

        return true;
    }
}
