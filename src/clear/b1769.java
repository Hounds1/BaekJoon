package clear;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 어거지로 통과한 것이라 개선 필요
 */
public class b1769 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] targets = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).parallel().toArray();

        int count = 1;
        long last = 0;

        if (targets.length == 1) {
            count = 0;
            last = targets[0];

            sb.append(count).append("\n");

            if (last % 3 == 0)
                sb.append("YES");
            else
                sb.append("NO");
        } else {

            for (int i : targets) {
                last += i;
            }

            while (last >= 10) {

                String[] newTargets = String.valueOf(last).split("");
                int[] array = Arrays.stream(newTargets).mapToInt(Integer::parseInt).parallel().toArray();

                last = 0;
                for (int i : array)
                    last += i;

                count++;
            }

            sb.append(count).append("\n");

            if (last % 3 == 0)
                sb.append("YES");
            else
                sb.append("NO");
        }


        System.out.println(sb);
    }
}
