import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, List<String>> map = new TreeMap<>();

        int len = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < len; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            int key = Integer.parseInt(split[0]);

            List<String> list = map.computeIfAbsent(key, val -> new ArrayList<>());
            list.add(split[1]);
        }

        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> {
            v.forEach(s -> {
                sb.append(k).append(" ").append(s).append("\n");
            });
        });

        System.out.println(sb);
    }
}