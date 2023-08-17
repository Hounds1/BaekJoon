package clear;

import java.util.Scanner;

public class b10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        sc.close();

        fibo(target, 1, 0, 1);
    }

    public static void fibo(int target, int count, int fir, int sec) {
        if (target == count) {
            System.out.println(sec);
            return;
        } else if (target == 0) {
            System.out.println(0);
            return;
        }


        int temp = sec;
        sec = sec + fir;
        fir = temp;
        count++;

        fibo(target, count, fir, sec);
    }
}
