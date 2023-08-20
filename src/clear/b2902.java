package clear;

import java.util.Scanner;

public class b2902 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] split = sc.nextLine().split("-");

        for (String s : split) {
            String substring = s.substring(0, 1);
            sb.append(substring);
        }

        System.out.println(sb);
    }
}
