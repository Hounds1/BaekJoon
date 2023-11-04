package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] target = sc.nextLine().split(" ");

        int[] fir = Arrays.stream(target[0].split("")).mapToInt(Integer::parseInt).parallel().toArray();
        int[] sec = Arrays.stream(target[1].split("")).mapToInt(Integer::parseInt).parallel().toArray();

        long sum = 0;
        for (int n : fir) {
            for (int m : sec) {
                sum += (long) n * m;
            }
        }

        System.out.println(sum);
    }
}
