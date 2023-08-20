package clear;

import java.util.Scanner;

public class b2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char[] charArray = sc.nextLine().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int num = charArray[i];
            if (num >= 65 && num <= 90) {
                sb.append(String.valueOf(charArray[i]).toLowerCase());
            } else {
                sb.append(String.valueOf(charArray[i]).toUpperCase());
            }
        }

        System.out.println(sb.toString());
    }
}
