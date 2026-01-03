import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine().trim());

        int[] table = new int[len];
        for (int i = 0; i < len; i++) {
            table[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }

        Arrays.sort(table);

        long result = 0;
        for (int i = 0; i < len; i++) {
            long c = (long) table[i] * (len - i);
            if (c > result) result = c;
        }

        System.out.println(result);
    }
}