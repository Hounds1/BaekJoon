import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.isEmpty()) break;

            int num = Integer.parseInt(line);
            Integer val = map.computeIfAbsent(num, k -> 0);
            val++;

            map.put(num, val);
        }

        int total = 0;
        int elements = 0;
        int val = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            total += entry.getKey() * entry.getValue();
            elements += entry.getValue();
            if (val < entry.getValue()) {
                val = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(total / elements);
        System.out.println(key);
    }
}