package clear;

import java.util.*;

public class b1181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            set.add(sc.nextLine());
        }

        String[] array = set.toArray(new String[0]);

        Arrays.sort(array, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        for (String s : array)
            System.out.println(s);
    }
}
