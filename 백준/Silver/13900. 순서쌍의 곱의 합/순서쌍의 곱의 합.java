import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arguments[i];
        }

        long total = 0;
        for (int i = 0; i < len; i++) {
            sum -= arguments[i];
            total += arguments[i] * sum;
        }

        System.out.println(total);
    }
}