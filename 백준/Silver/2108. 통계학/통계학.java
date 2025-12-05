import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        int total = 0;
        for (int num : arr) {
            total += num;
        }

        System.out.println((int) Math.round((double) total / (double) len));
        System.out.println(arr[len / 2]);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            Integer val = map.computeIfAbsent(i, k -> 0);
            map.put(i, val + 1);
        }

        if (map.size() == 1) {
            Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
            System.out.println(entry.getKey());
        } else {
            int max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) max = entry.getValue();
            }

            List<Integer> targets = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) targets.add(entry.getKey());
            }

            if (targets.size() == 1) {
                System.out.println(targets.get(0));
            } else {
                targets.sort(Comparator.naturalOrder());

                System.out.println(targets.get(1));
            }
        }

        if (arr[0] < 0) System.out.println(Math.abs(arr[0]) + arr[len - 1]);
        else System.out.println(arr[len - 1] - arr[0]);
    }
}