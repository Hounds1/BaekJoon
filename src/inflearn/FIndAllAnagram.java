package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FIndAllAnagram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] targets = bufferedReader.readLine().split("");
        String[] prefix = bufferedReader.readLine().split("");

        bufferedReader.close();

        Map<String, Integer> prefixMap = new HashMap<>();
        Map<String, Integer> targetsMap = new HashMap<>();

        for (String s : prefix) {
            prefixMap.put(s, prefixMap.getOrDefault(s, 0) + 1);
        }

        for (int i = 0; i < prefix.length - 1; i++) {
            targetsMap.put(targets[i], targetsMap.getOrDefault(targets[i], 0) + 1);
        }

        int count = 0, p1 = 0;

        for (int p2 = prefix.length - 1; p2 < targets.length; p2++) {
            targetsMap.put(targets[p2], targetsMap.getOrDefault(targets[p2], 0) + 1);

            if (targetsMap.equals(prefixMap)) {
                count++;
            }

            targetsMap.put(targets[p1], targetsMap.get(targets[p1]) - 1);

            if (targetsMap.get(targets[p1]) == 0) {
                targetsMap.remove(targets[p1]);
            }

            p1++;
        }

        System.out.println(count);
    }
}
