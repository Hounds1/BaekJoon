import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int len1 = arguments[0];
        final int len2 = arguments[1];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            map.put(bufferedReader.readLine(), 0);
        }

        for (int i = 0; i < len2; i++) {
            String line = bufferedReader.readLine();
            if (map.containsKey(line)) map.put(line, 1);
        }

        List<String> list = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v == 1) list.add(k);
        });

        list.sort(Comparator.naturalOrder());
        System.out.println(list.size());

        StringBuilder sb = new StringBuilder();
        list.forEach(e -> sb.append(e).append("\n"));
        System.out.println(sb);
    }
}