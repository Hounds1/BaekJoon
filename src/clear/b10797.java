package clear;

import java.util.Scanner;

public class b10797 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String scan = sc.nextLine();

        String[] list = sc.nextLine().split(" ");

        for (String s : list) {
            if (s.equals(scan))
                count++;
        }

        System.out.println(count);
    }
}
