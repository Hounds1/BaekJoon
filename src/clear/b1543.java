package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine();
        String keyword = bufferedReader.readLine();

        System.out.println((target.length() - target.replaceAll(keyword, "").length()) / keyword.length());
    }
}
