package clear;

import java.util.*;

public class b2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 1;
        for (int i = 0; i < 3; i++) {
            total *= sc.nextInt();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        String[] split = String.valueOf(total).split("");
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        for (int i : array) {
            map.put(i, map.get(i)+1);
        }

        Collection<Integer> values = map.values();
        for (int i : values)
            System.out.println(i);

        sc.close();
    }
}
