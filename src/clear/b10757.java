package clear;

import java.math.BigInteger;
import java.util.Scanner;

public class b10757 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);

        System.out.println(a.add(b));
    }
}
