import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len =  arguments[0];
        final int target =  arguments[1];

        List<Integer> cost = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            cost.add(Integer.parseInt(bufferedReader.readLine()));
        }

        cost.sort(Collections.reverseOrder());

        int remain = target;
        int cnt = 0;
        for (Integer i : cost) {
            if (i > remain) continue;

            cnt += remain / i;
            remain = remain % i;
        }

        System.out.println(cnt);
    }
}