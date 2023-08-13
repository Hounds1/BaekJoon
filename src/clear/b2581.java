package clear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                list.add(i);
                total+= i;
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(list.get(0));
        }

        sc.close();
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
