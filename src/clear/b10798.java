package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int range = 15;
        int vertical = 5;

        String[][] target = new String[vertical][range];
        for (int i = 0; i < vertical; i++) {
            Arrays.fill(target[i], " ");
        }

        for (int i = 0; i < vertical; i++) {
            String[] split = sc.nextLine().split("");

            for (int j = 0; j < split.length; j++) {
                target[i][j] = split[j];
            }
        }

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < vertical; j++) {
                sb.append(target[j][i]);
            }
        }

        System.out.println(sb.toString().replaceAll(" ", ""));
    }
}
