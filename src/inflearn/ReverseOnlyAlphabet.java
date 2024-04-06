package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOnlyAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder();

        char[] targets = bufferedReader.readLine().toCharArray();

        int pointer1 = 0;
        int pointer2 = targets.length - 1;

        while (pointer1 < pointer2) {
            if (!Character.isAlphabetic(targets[pointer1])) {
                pointer1++;
            } else if (!Character.isAlphabetic(targets[pointer2])) {
                pointer2--;
            } else {
                char temp1 = targets[pointer1];
                char temp2 = targets[pointer2];

                targets[pointer1] = temp2;
                targets[pointer2] = temp1;

                pointer1++;
                pointer2--;
            }
        }

        for (char target : targets) {
            builder.append(target);
        }

        System.out.println(builder);
    }
}
