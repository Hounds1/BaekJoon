package clear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] targets = sc.nextLine().split(" ");
        int range = Integer.parseInt(targets[0]);
        int routine = Integer.parseInt(targets[1]);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= range; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < routine; i++) {
            String[] switching = sc.nextLine().split(" ");
            int start = Integer.parseInt(switching[0]) - 1;
            int end = Integer.parseInt(switching[1]) - 1;

            if (start >= 0 && end < numbers.size() && start <= end) {
                List<Integer> sublist = numbers.subList(start, end + 1);
                Collections.reverse(sublist);
            } else {
                System.out.println("Invalid range.");
            }
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
