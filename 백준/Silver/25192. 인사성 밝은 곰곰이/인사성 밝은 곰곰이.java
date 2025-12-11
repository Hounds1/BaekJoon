import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        Set<String> entries = new HashSet<>();

        final String enter = "ENTER";

        int total = 0;
        for (int i = 0; i < len; i++) {
            String line = bufferedReader.readLine();

            if (line.equals(enter)) {
                total += entries.size();
                entries.clear();
                continue;
            }

            entries.add(line);
        }

        total += entries.size();
        System.out.println(total);
    }
}