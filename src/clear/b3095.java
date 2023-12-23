package clear;

import java.util.*;

public class b3095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        List<Integer> answers = new LinkedList<>();
        for (int i = 0; i < range; i++) {
            Map<Character, Integer> map = createFullMap();

            String target = sc.nextLine();

            int result = validate(target, map);
            answers.add(result);
        }

        for (Integer answer : answers) {
            System.out.println(answer);
        }

    }

    private static int validate(String target, Map<Character, Integer> fullMap) {
        char[] charArray = target.toCharArray();

        for (char c : charArray) {
            fullMap.remove(c);
        }

        int result = 0;
        Set<Map.Entry<Character, Integer>> entries = fullMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            result += entry.getValue();
        }

        return result;
    }

    private static Map<Character, Integer> createFullMap() {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 65; i <= 90; i++) {
            map.put((char) i, i);
        }

        return map;
    }
}
