package clear;

import java.util.Scanner;

/**
 * 서브테스크 전체 통과
 */
public class b10162 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] buttons = {300, 60, 10};
        int time = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            if (time % 10 != 0) {
                System.out.println(-1);
                break;
            }

            System.out.print(time / buttons[i] + " ");
            time = time % buttons[i];
        }
    }
}
