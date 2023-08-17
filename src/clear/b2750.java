package clear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < range; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }

        sc.close();

        int[] array = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
