package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalFinder {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        int range = Integer.parseInt(bufferedReader.readLine());

        int[] ch = new int[range + 1];
        for (int i = 2; i <= range; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= range; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
