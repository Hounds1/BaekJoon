package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = getMap();

        String[] split = sc.nextLine().split("");

        int total = 0;
        for (String s : split)
            total += map.get(s);

        System.out.println(total);
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();

        int A = 'A';
        int num = 3;
        int count = 0;

        for (int i = A; i < A+25; i++) {
            if (count == 3) {
                count = 0;
                num++;
            }
            map.put(String.valueOf((char) i), num);
            count++;
        }

        map.put("S", 8);
        map.put("V", 9);
        map.put("Y", 10);
        map.put("Z", 10);

        return map;
    }
}
