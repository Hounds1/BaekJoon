package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1264 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        String[] targets = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for (String t : targets)
            map.put(t, t);

        int count = 0;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty() || nextLine.equals("#"))
                break;

            String[] split = nextLine.split("");

            for (int i = 0; i < split.length; i++) {
                if (map.containsKey(split[i]))
                    count++;
            }

            System.out.println(count);
            count = 0;
        }
    }

}
