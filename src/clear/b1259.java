package clear;

import java.util.Scanner;

public class b1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String nextLine = sc.nextLine();

            if (nextLine.equals("0"))
                break;

            sb.append(nextLine).reverse();

            if (sb.toString().equals(nextLine))
                System.out.println("yes");
            else
                System.out.println("no");

            sb.setLength(0);
        }
    }
}
