package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HqLeaderVote {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());
        String[] result = bufferedReader.readLine().split("");

        bufferedReader.close();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < range; i++) {
            if (map.containsKey(result[i])) {
                map.put(result[i], map.get(result[i]) + 1);
            } else {
                map.put(result[i], 1);
            }
        }

        String answer = null;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}
