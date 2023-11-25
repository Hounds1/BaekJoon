package clear;

import java.util.Scanner;

public class b1568 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bird = sc.nextInt();

        int time = 0;
        int fly = 1;
        while (true) {
            if (bird == 0)
                break;

            if (fly > bird)
                fly = 1;

            bird -= fly;
            fly++;
            time ++;
        }

        System.out.println(time);
    }
}
