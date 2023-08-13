package clear;

import java.util.Scanner;

public class b1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        if (target == 0)
            System.out.println(1);
        else
            scan(target, 0, 0, target);

        sc.close();
    }

    public static void scan(int target, int count, int temp, int result) {
        if (temp == result) {
            System.out.println(count);
            return;
        }

        String targetStr = String.valueOf(target);
        if (targetStr.length() == 1)
            targetStr = 0 + targetStr;

        String[] split = targetStr.split("");
        int fir = Integer.parseInt(split[0]);
        int sec = Integer.parseInt(split[1]);
        int sum = fir + sec;

        String sumStr = String.valueOf(sum);
        String newTarget = String.valueOf(sec) + String.valueOf(sumStr.charAt(sumStr.length()-1));
        target = Integer.parseInt(newTarget);
        temp = target;
        count++;

        scan(target, count, temp, result);
    }
}
