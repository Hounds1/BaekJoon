package clear;

import java.util.Scanner;

public class b2440 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int range = sc.nextInt();
        int routine = range;
        sc.close();

        for (int i = 0; i < range; i++) {
            for (int j = routine; j > 0; j--) {
                sb.append("*");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
            routine--;
        }
    }
}
