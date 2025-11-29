import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int target = Integer.parseInt(bufferedReader.readLine());
        final int limit = 1000000;
        boolean exists = false;
        for (int i = 0; i <= limit; i++) {
            String s = String.valueOf(i);
            int[] arr = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();

            int temp = i;
            for (int i1 : arr) {
                temp +=  i1;
            }

            if (temp == target) {
                System.out.println(i);
                exists = true;
                break;
            }
        }

        if (!exists) System.out.println(0);
    }
}