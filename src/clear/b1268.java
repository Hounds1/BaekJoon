package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class b1268 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, int[]> map = new HashMap<>();

        String range = bufferedReader.readLine();

        int r = Integer.parseInt(range);

        for (int i  = 0; i < r; i++) {
            int[] intArr = map.computeIfAbsent(i + 1, val -> new int[]{0, 0, 0, 0, 0});

            List<Integer> list = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            for (int k = 0; k < list.size(); k++) {
                intArr[k] = list.get(k);
            }
        }

        Map<Integer, Set<Integer>> contains = new HashMap<>();

        map.keySet().forEach(key -> {
            contains.put(key, new HashSet<>());
        });

        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            for (Map.Entry<Integer, int[]> subEntry : map.entrySet()) {
                if (entry.getKey().equals(subEntry.getKey())) {
                    continue;
                }

                if (contains.get(entry.getKey()).contains(subEntry.getKey())) {
                    continue;
                }

                int[] origin = entry.getValue();
                int[] other = subEntry.getValue();

                for (int i = 0; i < origin.length; i++) {
                    if (origin[i] == other[i]) {
                        contains.get(entry.getKey()).add(subEntry.getKey());
                        contains.get(subEntry.getKey()).add(entry.getKey());

                        break;
                    }
                }
            }
        }

        int temp = 0;
        int val = 0;

        for (Map.Entry<Integer, Set<Integer>> entry : contains.entrySet()) {
            Integer k = entry.getKey();
            int v = entry.getValue().size();

            if (temp == v) {
                if (val > k) {
                    val = k;

                    continue;
                }
            }

            if (temp < v) {
                val = k;
                temp = v;
            }
        }

        System.out.println(val == 0 ? 1 : val);
    }
}
