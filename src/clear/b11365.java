package clear;

import java.util.Scanner;

public class b11365 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.equals("END"))
                break;


            String[] split = nextLine.split("");

            for (int i = split.length - 1; i >= 0; i--) {
                sb.append(split[i]);
            }

            System.out.println(sb);

            sb.setLength(0);
        }
    }
}
