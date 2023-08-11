package clear;

import java.util.Objects;
import java.util.Scanner;

public class b2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int fir = Integer.parseInt(Objects.requireNonNull(reverse(split[0])));
        int sec = Integer.parseInt(Objects.requireNonNull(reverse(split[1])));

        System.out.println(Math.max(fir, sec));
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
