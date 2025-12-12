import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        List<String> arguments = new ArrayList<>();

        arguments.add(line);
        for (int i = 1; i < line.length(); i++) {
            arguments.add(line.substring(i));
        }

        arguments.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        arguments.forEach(a -> sb.append(a).append("\n"));

        System.out.println(sb);
    }
}