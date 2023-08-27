package clear;

import java.util.Scanner;

public class b3406 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int range = sc.nextInt();

        for (int i = 0; i < range; i++) {
            String binaryString = Integer.toBinaryString(sc.nextInt());

            String[] split = binaryString.split("");

            int index = 0;
            for (int j = split.length - 1; j >= 0; j--) {
                if (split[j].equals("1")) {
                    sb.append(index + " ");
                }
                index++;
            }
        }

        System.out.println(sb);

        sb.setLength(0);
    }
}
