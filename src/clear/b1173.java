package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1173 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int[] intArray = Arrays.stream(split).mapToInt(Integer::parseInt).parallel().toArray();

        int total = 0;
        int mins = 0;
        int target = intArray[0];

        int minBeat = intArray[1];
        int maxBeat = intArray[2];
        int nowBeat = minBeat;

        int increase = intArray[3];
        int decrease = intArray[4];

        if (minBeat + increase > maxBeat) {
            System.out.println(-1);
            return;
        }

        while (true) {
            if (mins == target)
                break;

            if (nowBeat + increase > maxBeat) {
                total ++;
                nowBeat -= decrease;

                if (nowBeat < minBeat)
                    nowBeat = minBeat;

                continue;
            }

            nowBeat += increase;
            total++;
            mins++;
        }

        System.out.println(total);
    }
}
