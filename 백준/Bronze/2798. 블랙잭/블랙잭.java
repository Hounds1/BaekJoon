import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len =  arguments[0];
        final int limit =  arguments[1];

        int[] cards = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k  = j + 1; k < len; k++) {
                    final int val = cards[i] + cards[j] + cards[k];
                    if (val <= limit && val > answer) answer = val;
                }
            }
        }

        System.out.println(answer);
    }
}