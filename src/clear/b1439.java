package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String target = bufferedReader.readLine();

        int n = target.length();
        int flips = 0;

        for (int i = 1; i < n; i++) {
            if (target.charAt(i) != target.charAt(i - 1)) {
                flips++;
            }
        }

        if (target.charAt(0) != target.charAt(n - 1)) {
            flips++;
        }

        System.out.println(flips / 2);
    }
}
