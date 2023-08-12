package clear;

import java.util.Scanner;

public class b2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int range = Integer.parseInt(split[0]);
        int elements = Integer.parseInt(split[1]);

        int[][] arr1 = new int[range][elements];
        for (int i = 0; i < range; i++) {
            String[] targets = sc.nextLine().split(" ");
            for (int j = 0; j < elements; j++) {
                arr1[i][j] = Integer.parseInt(targets[j]);
            }
        }

        int[][] arr2 = new int[range][elements];
        for (int i = 0; i < range; i++) {
            String[] targets = sc.nextLine().split(" ");
            for (int j = 0; j < elements; j++) {
                arr2[i][j] = Integer.parseInt(targets[j]);
            }
        }

        for (int i = 0; i < range; i++) {
            int[] arr3 = new int[elements];
            for (int j = 0; j < elements; j++) {
                arr3[j] = arr1[i][j] + arr2[i][j];
            }

            /**
             * 하나씩 System.out.print()로 출력하고
             * 반복문 다음 System.out.println(" ")을 사용하면
             * 정답과 같은 형식이 나오나 오답처리 됩니다.
             */
            String answer = "";
            for (int t : arr3) {
                answer += String.valueOf(t);
                answer += " ";
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
