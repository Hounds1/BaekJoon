import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int radix = 2;
        String[] targets = bufferedReader.readLine().split(" ");
        System.out.println(new BigInteger(targets[0], radix).add(new BigInteger(targets[1], radix)).toString(radix));
    }
}