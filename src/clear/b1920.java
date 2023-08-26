package clear;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Map<Integer, Boolean> map = new HashMap<>();

        int range = Integer.parseInt(sc.nextLine());
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        for (int i = 0; i < range; i++) {
            map.put(array[i], true);
        }

        int targetRange = Integer.parseInt(sc.nextLine());

        int[] targets = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        for (int i = 0; i < targetRange; i++) {
            if (map.containsKey(targets[i]))
                sb.append("1" + "\n");
            else
                sb.append("0" + "\n");
        }

        System.out.println(sb);
    }
}
