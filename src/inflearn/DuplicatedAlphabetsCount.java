package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicatedAlphabetsCount {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] targets = bufferedReader.readLine().split("");
        StringBuilder builder = new StringBuilder();

        int location = 0;
        int range = 1;
        int pointer = location + 1;

        while (location < targets.length - 1) {

            if (pointer < targets.length && targets[location].equals(targets[pointer])) {
                pointer++;
                range++;
            } else {
                if (range == 1) {
                    builder.append(targets[location]);
                } else {
                    builder.append(targets[location]).append(range);
                    range = 1;
                }
                location = pointer;
                pointer = Math.min(location + 1, targets.length);
            }
        }

        System.out.println(builder);
    }
}
