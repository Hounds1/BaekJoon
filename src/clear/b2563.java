package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b2563 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int colorPaper = Integer.parseInt(sc.nextLine());

        int total = 0;

        int[][] whitePaper = new int[100][100];

        for (int i = 0; i < whitePaper.length; i++) {
            Arrays.fill(whitePaper[i], 0);
        }

        for (int i = 0; i < colorPaper; i++) {
            String[] split = sc.nextLine().split(" ");
            int row = Integer.parseInt(split[0]);
            int vertical = Integer.parseInt(split[1]);

            for (int j = vertical; j < vertical+10; j++) {
                for (int k = row; k < row+10; k++) {
                    whitePaper[j][k] = 1;
                }
            }
        }

        for (int[] space : whitePaper) {
            for (int j = 0; j < whitePaper[0].length; j++) {
                if (space[j] == 1)
                    total++;
            }
        }

        System.out.println(total);

        sc.close();
    }
}
