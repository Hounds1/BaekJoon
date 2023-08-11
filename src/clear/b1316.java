package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        int routine = 0;
        int count = 0;
        while (sc.hasNextLine()) {
            if (routine == range)
                break;

            String[] target = sc.nextLine().split("");

            if (validation(target)) {
                count++;
            }

            routine++;
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean validation(final String[] target) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < target.length; i++) {
            if (!map.containsKey(target[i])) {
                map.put(target[i], i);
            } else {
                if (i - map.get(target[i]) == 1) {
                    map.put(target[i], i);
                } else if (i - map.get(target[i]) > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
