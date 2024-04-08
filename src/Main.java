import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] target1 = bufferedReader.readLine().split("");
        String[] target2 = bufferedReader.readLine().split("");

        bufferedReader.close();

        Map<String, Integer> target1Map = new HashMap<>();
        Map<String, Integer> target2Map = new HashMap<>();

        for (String s : target1) {
            if (target1Map.containsKey(s)) {
                target1Map.put(s, target1Map.get(s) + 1);
            } else {
                target1Map.put(s, 1);
            }
        }

        for (String s : target2) {
            if (target2Map.containsKey(s)) {
                target2Map.put(s, target2Map.get(s) + 1);
            } else {
                target2Map.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : target1Map.entrySet()) {
            if (entry.getValue() != target2Map.get(entry.getKey())) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}