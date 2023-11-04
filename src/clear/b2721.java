package clear;

import java.util.Scanner;

public class b2721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            System.out.println(weight(Integer.parseInt(sc.nextLine())));
        }
    }

    private static int weight(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int weight = i * calc(i + 1);
            sum += weight;
        }

        return sum;
    }

    private static int calc(int n) {
        return n * (n + 1) / 2;
    }
}
