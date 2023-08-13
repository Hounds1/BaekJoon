package clear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        System.out.println(find(n, k));

        sc.close();
    }

    public static int find(int n, int k) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                divisors.add(i);
        }

        if (k <= divisors.size()) {
            return divisors.get(k - 1);
        } else {
            return 0;
        }
    }
}
