package clear;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1453 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Boolean> pc = new HashMap<>();

        sc.nextLine();

        int denied = 0;
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : array) {
            if (pc.containsKey(i))
                denied++;
            else
                pc.put(i, true);
        }

        System.out.println(denied);
    }
}
