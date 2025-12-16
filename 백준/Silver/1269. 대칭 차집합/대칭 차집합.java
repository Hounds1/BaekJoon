import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0;

        Set<Integer> fir = new HashSet<>();
        int[] items1 = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : items1) {
            fir.add(i);
        }

        Set<Integer> sec = new HashSet<>();
        int[] items2 = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : items2) {
            if (!fir.contains(i)) cnt++;
            sec.add(i);
        }

        for (int i : items1) {
            if (!sec.contains(i)) cnt++;
        }

        System.out.println(cnt);
    }
}