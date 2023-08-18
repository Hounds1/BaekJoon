package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split("");
        sc.close();

        Arrays.sort(split);

        for (int i = split.length-1; i >= 0; i--) {
            System.out.print(split[i]);
        }
    }
}
