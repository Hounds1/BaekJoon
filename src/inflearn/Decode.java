package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Decode {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();
        String encoded = bufferedReader.readLine().replaceAll("#", "1")
                .replaceAll("[*]", "0");

        List<String> separated = new LinkedList<>();

        int range = 7;
        for (int i = 0; i < encoded.length(); i += range) {
            String separate = encoded.substring(i, Math.min(encoded.length(), i + range));
            if (!separate.isEmpty() && !separate.equals(" ")) {
                separated.add(separate);
            }
        }

        for (String s : separated) {
            char decoded = (char) Integer.parseInt(s, 2);
            System.out.print(decoded);
        }
    }
}
