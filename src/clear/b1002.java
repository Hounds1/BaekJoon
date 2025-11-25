package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1002 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < range; i++) {
            int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int x1 = arr[0], y1 = arr[1], r1 = arr[2], x2 = arr[3],  y2 = arr[4], r2 = arr[5];

            int dx = x2 - x1, dy = y2 - y1;
            int rp = r1 + r2, rm = Math.abs(r1 - r2);
            int sp = rp * rp, sm = rm * rm;

            int d2 = dx * dx + dy * dy;

            if (d2 == 0 && r1 == r2) {
                System.out.println(-1);
                continue;
            }

            if (d2 == sp || d2 == sm) {
                System.out.println(1);
                continue;
            }

            if (sm < d2 && d2 < sp) {
                System.out.println(2);
                continue;
            }

            System.out.println(0);
        }
    }
}
