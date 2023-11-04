package clear;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1371 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {

            String nextLine = sc.nextLine();
            if (nextLine.isEmpty() || nextLine.isBlank())
                continue;

            String replaced = nextLine.replaceAll(" ", "");
            String[] split = replaced.split("");

            for (String s : split) {
                if (!map.containsKey(s))
                    map.put(s, 1);
                else
                    map.put(s, map.get(s) + 1);
            }
        }

        int max = 0;
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                sb.setLength(0);
                sb.append(entry.getKey());
            } else if (entry.getValue() == max) {
                sb.append(entry.getKey());
            }
        }

        String result = sb.toString();
        if (result.length() > 1) {
            String[] split = result.split("");
            Arrays.sort(split);

            sb.setLength(0);
            for (String s : split) {
                sb.append(s);
            }
        }

        System.out.println(sb);
    }
}
