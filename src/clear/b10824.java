package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b10824 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        sb.append(array[0]);
        sb.append(array[1]);

        long fir = Long.parseLong(sb.toString());

        sb.setLength(0);

        sb.append(array[2]);
        sb.append(array[3]);

        long sec = Long.parseLong(sb.toString());

        sb.setLength(0);

        System.out.println(fir + sec);
    }
}
