import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            String line = bufferedReader.readLine();

            Integer val = map.computeIfAbsent(line, k -> 0);
            map.put(line, val + 1);
        }

        int max = 0;
        for (Integer value : map.values()) {
            if (value > max) max = value;
        }

        List<String> books = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) books.add(entry.getKey());
        }

        books.sort(Comparator.naturalOrder());

        System.out.println(books.get(0));
    }
}