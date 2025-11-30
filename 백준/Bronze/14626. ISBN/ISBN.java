import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();

        for (int i = 0; i <= 9; i++) {
            int idx = line.indexOf("*");
            String replace = line.replace("*", String.valueOf(i));

            int[] arr = Arrays.stream(replace.split("")).mapToInt(Integer::parseInt).toArray();

            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j % 2 != 0) total += arr[j] * 3;
                else total += arr[j];
            }

            if (total % 10 == 0) {
                System.out.println(arr[idx]);
                break;
            }
        }
    }
}