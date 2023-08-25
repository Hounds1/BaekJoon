package clear;

import java.util.*;


/**
 * 서브 테스크 전체 통과
 */
public class b13300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> boys = new HashMap<>();
        Map<Integer, Integer> girls = new HashMap<>();
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        int range = array[0];
        int limit = array[1];

        int boy = 1;

        for (int i = 0; i < range; i++) {
            int[] target = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

            if (target[0] == boy) {
                if (boys.containsKey(target[1]))
                    boys.put(target[1], boys.get(target[1]) + 1);
                else
                    boys.put(target[1], 1);
            } else {
                if (girls.containsKey(target[1]))
                    girls.put(target[1], girls.get(target[1]) + 1);
                else
                    girls.put(target[1], 1);
            }
        }

        int total = 0;

        Set<Map.Entry<Integer, Integer>> entriesOfBoys = boys.entrySet();

        for (Map.Entry<Integer, Integer> entryOfBoy : entriesOfBoys) {
            total += (int) Math.ceil((double) entryOfBoy.getValue() / limit);
        }

        Set<Map.Entry<Integer, Integer>> entriesOfGirls = girls.entrySet();

        for (Map.Entry<Integer, Integer> entryOfGirl : entriesOfGirls) {
            total += (int) Math.ceil((double) entryOfGirl.getValue() / limit);
        }

        System.out.println(total);
    }
}
