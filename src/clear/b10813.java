package clear;

import java.util.Scanner;

public class b10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] targets = sc.nextLine().split(" ");
        int range = Integer.parseInt(targets[0]);
        int routine = Integer.parseInt(targets[1]);

        int[] bucket = new int[range];

        for (int i = 0; i < range; i++) {
            bucket[i] = i + 1;
        }

        int fir = 0;
        int sec = 0;

        for (int i = 0; i < routine; i++) {
            String[] switching = sc.nextLine().split(" ");
            fir = Integer.parseInt(switching[0])-1;
            sec = Integer.parseInt(switching[1])-1;

            bucket = temp(bucket, fir, sec);
        }

        for (int i : bucket)
            System.out.print(i + " ");
    }

    public static int[] temp(int[] arr, int fir, int sec) {
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec] = temp;

        return arr;
    }
}
