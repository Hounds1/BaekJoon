package clear;

import java.util.Scanner;

public class b11382 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        long result = 0;

        for (String s : arr) {
            result += Long.parseLong(s);
        }

        System.out.println(result);
    }
}
