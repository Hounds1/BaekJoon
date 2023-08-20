package clear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b2455 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int now = 0;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.isEmpty())
                break;

            int[] array = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

            now -= array[0];
            now += array[1];

            list.add(now);
        }

        int max = 0;

        for (int i : list) {
            if (max < i)
                max = i;
        }

        System.out.println(max);
    }
}
