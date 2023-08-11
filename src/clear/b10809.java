package clear;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int a = (int)'a';
        for (int i = a; i <= a+25; i++) {
            map.put(String.valueOf((char)i), -1);
        }

        String[] split = sc.nextLine().split("");

        for(int i = 0; i < split.length; i++) {
            if (map.get(split[i]) != -1)
                continue;

            map.put(split[i], i);
        }

        Collection<Integer> values = map.values();
        for (Integer i : values)
            System.out.print(i + " ");
    }
}
