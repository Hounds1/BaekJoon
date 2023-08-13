package clear;

import java.util.Scanner;

public class b2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int V = Integer.parseInt(split[2]);

        System.out.println((int)Math.ceil((double) (V - A)/(A - B) + 1));
    }
}
