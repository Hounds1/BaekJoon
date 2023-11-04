package clear;

import java.util.Scanner;

public class b2857 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty())
                break;

            if (nextLine.contains("FBI"))
                sb.append(idx).append(" ");

            idx++;
        }

        if (sb.toString().isEmpty())
            System.out.println("HE GOT AWAY!");

        System.out.println(sb);
    }
}
