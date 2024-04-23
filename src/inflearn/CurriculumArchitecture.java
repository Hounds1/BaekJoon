package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurriculumArchitecture {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String regex = bufferedReader.readLine();
        System.out.println(bufferedReader.readLine().replaceAll("[^" + regex + "]", "").equals(regex) ? "YES" : "NO");
    }
}
