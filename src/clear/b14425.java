package clear;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b14425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = array[0];
        int b = array[1];
        int count = 0;

        for (int i = 0; i < a; i++) {
            map.put(sc.nextLine(), 1);
        }

        for (int i = 0; i < b; i++) {
            if (map.containsKey(sc.nextLine()))
                count++;
        }

        sc.close();
        System.out.println(count);
    }
}
