package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        int range = 10;
        for (int i = 0; i < range; i++) {
            int target = Integer.parseInt(sc.nextLine()) % 42;
            map.put(target, 0);
        }

        System.out.println(map.size());
    }
}
