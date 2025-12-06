import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String discard = bufferedReader.readLine();

        String[] cards = bufferedReader.readLine().split(" ");
        
        Map<String, Integer> map = new HashMap<>();

        for (String card : cards) {
            Integer val = map.computeIfAbsent(card, k -> 0);
            map.put(card, val + 1);
        }

        String discard2 = bufferedReader.readLine();

        String[] targets = bufferedReader.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String target : targets) {
            Integer val = map.get(target);

            if (val == null) sb.append(0).append(" ");
            else sb.append(val).append(" ");
        }

        System.out.println(sb);
    }
}