import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int len = Integer.parseInt(bufferedReader.readLine());
        int[] ints = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        for (int i = 0; i < len; i++) {
            int total = 0;
            for (int j = i; j < len; j++) {
                total += ints[j];

                final int range = j - i + 1;

                for (int k = i; k <= j; k++) {
                    if (ints[k] * range == total) {
                       answer++;
                       break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}