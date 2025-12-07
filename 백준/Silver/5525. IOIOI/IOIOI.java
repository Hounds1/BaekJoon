import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int len = Integer.parseInt(bufferedReader.readLine());
        String line = bufferedReader.readLine();

        final char I = 'I';
        final char O = 'O';

        int cnt = 0;
        int range = 0;
        for (int i = 1; i < len - 1; i++) {
            char c1 = line.charAt(i - 1);
            char c2 = line.charAt(i);
            char c3 = line.charAt(i + 1);

            if (c1 == I && c2 == O && c3 == I) {
                range++;
                if (range >= N) cnt++;
                i++;
            } else range = 0;
        }

        System.out.println(cnt);
    }
}