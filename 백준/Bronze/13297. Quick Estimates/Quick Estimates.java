import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int len = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < len; i++) {
            System.out.println(bufferedReader.readLine().length());
        }
    }
}