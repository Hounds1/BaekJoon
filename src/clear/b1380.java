package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b1380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Map<Integer, String> nameWithCount = new HashMap<>();
        Map<Integer, Integer> countWithDuplicate = new HashMap<>();
        int count = 1;

        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty() || nextLine.equals("0"))
                break;

            int rangeForName = Integer.parseInt(nextLine);

            for (int i = 1; i <= rangeForName; i++) {
                nameWithCount.put(i, sc.nextLine());
            }

            int searchForRange = (rangeForName * 2) - 1;

            for (int i = 0; i < searchForRange; i++) {
                String[] split = sc.nextLine().split(" ");
                int target = Integer.parseInt(split[0]);

                if (countWithDuplicate.containsKey(target))
                    countWithDuplicate.put(target, countWithDuplicate.get(target) + 1);
                else
                    countWithDuplicate.put(target, 1);
            }

            Set<Map.Entry<Integer, Integer>> entries = countWithDuplicate.entrySet();

            for (Map.Entry<Integer, Integer> entry : entries) {
                int value = entry.getValue();
                if (value == 1) {
                    sb.append(count).append(" ").append(nameWithCount.get(entry.getKey())).append("\n");
                    count++;
                }
            }

            nameWithCount.clear();
            countWithDuplicate.clear();
        }

        System.out.println(sb);
    }
}
