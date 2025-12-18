import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String chong = "ChongChong";
        Set<String> set = new HashSet<>();
        set.add(chong);
        
        int len = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < len; i++) {
            String[] parts = bufferedReader.readLine().split(" ");
            String arg1 = parts[0];
            String arg2 = parts[1];

            if (set.contains(arg1) || set.contains(arg2)) {
                set.add(arg1);
                set.add(arg2);
            }
        }

        System.out.println(set.size());
    }
}