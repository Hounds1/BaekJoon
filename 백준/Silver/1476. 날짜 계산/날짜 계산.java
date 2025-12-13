import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int E = arguments[0];
        final int S = arguments[1];
        final int M = arguments[2];

        int e = 1, s = 1, m = 1;

        int r = 1;
        while (e != E || s != S || M != m) {
            if (e == 15) e = 1;
            else e++;

            if (s == 28) s = 1;
            else s++;

            if (m == 19) m = 1;
            else m++;

            r++;
        }

        System.out.println(r);
    }
}