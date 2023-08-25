package clear;

import java.util.*;

public class b2746 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        Map<Integer, Integer> map = new HashMap<>();

        long temp = 0L;
        long top = 0L;
        int max = 0;
        int dup = 0;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty())
                break;

            int[] array = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

            for (int k : array) {
                if (map.containsKey(k))
                    map.put(k, map.get(k) + 1);
                else
                    map.put(k, 1);
            }

            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

            for (Map.Entry<Integer, Integer> entry : entries) {
                if (entry.getValue() > dup) {
                    dup = entry.getValue();
                    max = entry.getKey();
                }
            }

            if (dup == 1) {
                for (Map.Entry<Integer, Integer> entry : entries) {
                    if (entry.getKey() > max) {
                        max = entry.getKey();
                    }
                }
            }

            if (dup == 1) {
                temp = max * 100;
                dup = 0;
                max = 0;
            } else if (dup == 2) {
                temp = 1000 + (max * 100);
                dup = 0;
                max = 0;
            } else if (dup == 3) {
                temp = 10000 + (max * 1000);
                dup = 0;
                max = 0;
            }

            if (temp > top)
                top = temp;

            map.clear();
        }

        System.out.println(top);
    }
}
