package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongWord {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = bufferedReader.readLine().split(" ");

        String answer = split[0];

        for (String s : split) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        System.out.println(answer);
    }
}
