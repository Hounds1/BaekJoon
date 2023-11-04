package clear;

import java.util.*;

public class b1233 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        int[] ranges = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

        List<int[]> list = new LinkedList<>();

        for (int r : ranges) {
            int[] arr = new int[r];
            for (int i = 0; i < r; i++) {
                arr[i] = i + 1;
            }

            list.add(arr);
        }

        int[] first = list.get(0);
        int[] second = list.get(1);
        int[] third = list.get(2);

        for (int f : first) {
            for (int s : second) {
                for (int t : third) {
                    int sum = f + s + t;

                    if (!map.containsKey(sum))
                        map.put(sum, 1);
                    else
                        map.put(sum, map.get(sum) + 1);
                }
            }
        }

        int maxKey = 0;
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
}
