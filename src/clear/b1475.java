package clear;

import java.util.*;

public class b1475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }

        int[] intArr = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        for (int i : intArr) {
            map.put(i, map.get(i)+1);
        }


        int top = 0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getKey() == 6 || entry.getKey() == 9)
                continue;

            if (entry.getValue() > top)
                top = entry.getValue();
        }

        int sixAndNine = map.get(6) + map.get(9);

        if (sixAndNine % 2 == 0)
            sixAndNine /= 2;
        else
            sixAndNine = (int)Math.floor((double) sixAndNine / 2) + 1;


        if (top < sixAndNine)
            top = sixAndNine;

        System.out.println(top);
    }
}
