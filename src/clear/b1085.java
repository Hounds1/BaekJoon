package clear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int x = array[0], y = array[1], w = array[2], h = array[3];

        List<Integer> list = new ArrayList<>();
        list.add(w - x);
        list.add(h - y);
        list.add(x);
        list.add(y);

        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (min > i)
                min = i;
        }

        System.out.println(min);
    }
}
