package clear;

import java.util.Scanner;

public class b1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");

        int result = 0;

        for (String s : split) {
            if (s.isBlank() || s.isEmpty())
                result -= 1;

            result += 1;
        }
        System.out.println(result);
    }
}
