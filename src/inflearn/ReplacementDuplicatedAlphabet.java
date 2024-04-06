package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplacementDuplicatedAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] targets = bufferedReader.readLine().split("");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(targets));

        StringBuilder builder = new StringBuilder();

        for (String s : set) {
            builder.append(s);
        }

        System.out.println(builder);
    }
}
