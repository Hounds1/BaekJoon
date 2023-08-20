package clear;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class b1292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = array[0];
        int end = array[1];

        int count = 50;
        int index = 1;
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        while (true) {
            if (index == count)
                break;

            for (int i = 0; i < index; i++) {
                list.add(index);
            }

            index++;
        }

        for (int i = start-1; i <= end-1; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
