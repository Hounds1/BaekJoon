package clear;

import java.util.*;

public class b2822 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = new int[8];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            int parsed = Integer.parseInt(sc.nextLine());
            map.put(parsed, i + 1);
            array[i] = parsed;
        }

        Arrays.sort(array);

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = array.length - 1; i > array.length - 6; i--) {
            sum += array[i];
            list.add(map.get(array[i]));
        }

        int[] answers = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answers);

        StringBuilder sb = new StringBuilder();
        for (int i : answers) {
            sb.append(i).append(" ");
        }

        System.out.println(sum);
        System.out.println(sb);
    }
}
