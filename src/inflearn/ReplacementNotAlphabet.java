package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplacementNotAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine().toLowerCase();

        target = target.replaceAll("[^a-z]", "");

        if (!isEqualsReverse(target)) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }

    public static boolean isEqualsReverse(String target) {
        StringBuilder builder = new StringBuilder();

        String[] targets = target.split("");

        for (int i = targets.length - 1; i >= 0; i--) {
            builder.append(targets[i]);
        }

        return builder.toString().equals(target);
    }
}
