package clear;

import java.util.*;

public class b5073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<Integer, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.equals("0 0 0"))
                break;

            int[] array = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

            Arrays.sort(array);

            int a = array[0];
            int b = array[1];
            int c = array[2];

            if(c >= a + b) {
                System.out.println("Invalid");
                continue;
            }

            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i]))
                    map.put(array[i], map.get(array[i]) + 1);
                else
                    map.put(array[i], 1);
            }

            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

            int dup = 0;
            for (Map.Entry<Integer, Integer> entry : entries) {
                if (entry.getValue() > dup) {
                    dup = entry.getValue();
                }
            }

            if (dup == 1)
                System.out.println("Scalene");
            else if (dup == 2)
                System.out.println("Isosceles");
            else
                System.out.println("Equilateral");

            map.clear();
        }
    }
}
