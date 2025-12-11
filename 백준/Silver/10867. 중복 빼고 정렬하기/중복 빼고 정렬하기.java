import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        Set<Integer> set = new HashSet<>();
        String[] arguments = bufferedReader.readLine().split(" ");
        for (String argument : arguments) {
            set.add(Integer.parseInt(argument));
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        list.forEach(e -> sb.append(e).append(" "));

        System.out.println(sb);
    }
}