package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CaseOfSalesPrice {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int[] ranges = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int days = ranges[0], range = ranges[1];

        int[] targets = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < range - 1; i++) {
            map.put(targets[i], map.getOrDefault(targets[i], 0) + 1);
        }

        int p1 = 0;
        for (int p2 = range - 1; p2 < days; p2++) {
            map.put(targets[p2], map.getOrDefault(targets[p2], 0) + 1);

            list.add(map.size());

            map.put(targets[p1], map.get(targets[p1]) - 1);
            if (map.get(targets[p1]) == 0) {
                map.remove(targets[p1]);
            }

            p1++;
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
