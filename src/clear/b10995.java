package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class b10995 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        int round = 1;
        for (int i = 0; i < range; i++) {
            System.out.println(buildLine(range, round));
            round++;
        }
    }

    private static String buildLine(int range, int round) {
        String line = "";

        if (round % 2 == 0) {
            line += " ";
        }

        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 0; i < range; i++) {
            joiner.add("*");
        }

        return line + joiner;
    }
}
