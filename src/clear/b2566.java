package clear;

import java.util.Scanner;

public class b2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int indexI = 0;
        int indexJ = 0;

        int range = 9;

        int[][] numbers = new int[range][range];
        for (int i = 0; i < range; i++) {
            String[] split = sc.nextLine().split(" ");
            for (int j = 0; j < range; j++) {
                int target = Integer.parseInt(split[j]);
                numbers[i][j] = target;

                if (target > max) {
                    max = target;
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        indexI += 1;
        indexJ += 1;

        System.out.println(max);
        System.out.println(indexI + " " + indexJ);

        sc.close();
    }
}
