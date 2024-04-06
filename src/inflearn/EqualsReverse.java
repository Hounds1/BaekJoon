package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualsReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine().toLowerCase();
        String[] targets = target.split("");

        StringBuilder builder = new StringBuilder();

        for (int i = target.length() - 1; i >= 0; i--) {
            builder.append(targets[i]);
        }

        if (builder.toString().equals(target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
