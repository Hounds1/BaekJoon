package clear;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1159 {

    public static void main(String[] args) {
        final String surrender = "PREDAJA";

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int range = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < range; i++) {
            String nextLine = sc.nextLine();
            String key = nextLine.substring(0, 1);
            if (!map.containsKey(key))
                map.put(key, 1);
            else
                map.put(key, map.get(key) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5)
                sb.append(entry.getKey());
        }

        String team = sb.toString();
        if (team.isEmpty() || team.isBlank()) {
            System.out.println(surrender);
            return;
        }

        String[] split = team.split("");

        Arrays.sort(split);

        sb.setLength(0);

        for (String s : split)
            sb.append(s);

        System.out.println(sb);
    }
}
