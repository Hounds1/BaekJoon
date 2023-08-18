package clear;

import java.util.*;

public class b10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        int a = 'a';

        for (int i = a; i <= a+25; i++) {
            map.put(String.valueOf((char) i), 0);
        }

        String[] split = sc.nextLine().split("");

        for (String s : split) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            }
        }

        Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>(values);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
