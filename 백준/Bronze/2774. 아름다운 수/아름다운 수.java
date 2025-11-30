import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            String[] split = bufferedReader.readLine().split("");

            set.addAll(Arrays.asList(split));

            System.out.println(set.size());
            set.clear();
        }
    }
}