package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        String[] split = sc.nextLine().toLowerCase().split("");

        for (String s : split) {
            if (map.containsKey(s)) {
                int score = map.get(s);
                map.put(s, score+1);
            } else
                map.put(s, 1);
        }

        String target = "";
        int targetVal = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (map.get(entry.getKey()) > targetVal) {
                target = entry.getKey();
                targetVal = entry.getValue();
            } else if (map.get(entry.getKey()) == targetVal) {
                target = "?";
            }
        }

        System.out.println(target.toUpperCase());
    }
}
