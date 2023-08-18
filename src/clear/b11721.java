package clear;

import java.util.Scanner;

public class b11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();
        sc.close();

        int totalLength = target.length();
        int ceil = (int) Math.ceil((double) totalLength / 10);

        int start = 0;
        int end = 10;

        for (int i = 0; i < ceil; i++) {
            if (end > totalLength) {
                System.out.println(target.substring(start));
                break;
            }

            System.out.println(target.substring(start, end));

            start += 10;
            end += 10;
        }
    }
}
