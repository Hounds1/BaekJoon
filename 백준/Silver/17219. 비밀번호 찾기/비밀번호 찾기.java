import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int len1 = arguments[0];
        final int len2 = arguments[1];

        StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < len1; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            map.put(split[0], split[1]);
        }

        for (int i = 0; i < len2; i++) {
            sb.append(map.get(bufferedReader.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}