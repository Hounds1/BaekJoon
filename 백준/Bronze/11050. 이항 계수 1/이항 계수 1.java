import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int n = arguments[0];
        final int k =  arguments[1];

        System.out.println(fac(n) / (fac(k) * fac(n - k)));
    }

    public static int fac(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        return fac;
    }
}