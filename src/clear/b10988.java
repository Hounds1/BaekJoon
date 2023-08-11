package clear;

import java.util.Scanner;

public class b10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();
        String reverse = reverse(target);

        if (target.equals(reverse))
            System.out.println(1);
        else
            System.out.println(0);

        sc.close();
    }

    public static String reverse(String target) {
        if (target.isBlank() || target.isEmpty())
            return null;

        char[] chars = target.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
