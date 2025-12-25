import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int len = Integer.parseInt(bufferedReader.readLine());

        String[] arguments = bufferedReader.readLine().split(" ");
        int[] table = new int[len];

        long temp = 0;
        for (int i = 0; i < len; i++) {
            table[i] = Integer.parseInt(arguments[i]);
            temp += table[i];
        }

        long val = 0;
        for (int i = 0; i < len; i++) {
            temp -= table[i];
            val += table[i] * temp;
        }

        System.out.println(val);
    }
}