import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        Set<String> set = new HashSet<>();

        final String enter = "enter";
        for (int i = 0; i < len; i++) {
            String[] arguments = bufferedReader.readLine().split(" ");

            if (arguments[1].equals(enter)) set.add(arguments[0]);
            else set.remove(arguments[0]);
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        list.forEach(e -> sb.append(e).append("\n"));

        System.out.println(sb);
    }
}