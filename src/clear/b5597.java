package clear;

import java.util.*;

public class b5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        int routine = 28;
        for (int i = 0; i < routine; i++) {
            int target = Integer.parseInt(sc.nextLine());
            map.put(target, target);
        }

        List<Integer> list = new ArrayList<>();

        int range = 30;
        for (int i = 1; i <= range; i++) {
            if (!map.containsKey(i))
                list.add(i);
        }

        int a = list.get(0);
        int b = list.get(1);
        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
