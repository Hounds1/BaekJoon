package clear;

import java.util.Scanner;

public class b11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int total = 0;
        String[] split = sc.nextLine().split("");
        for (String t : split)
            total += Integer.parseInt(t);

        System.out.println(total);

        sc.close();
    }
}
