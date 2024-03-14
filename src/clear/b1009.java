package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1009 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int range = Integer.parseInt(br.readLine());

            for (int i = 0; i < range; i++) {
                int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int n = 1;
                for (int j = 0; j < array[1]; j++) {
                    n = (n * array[0]) % 10;
                }

                System.out.println(n == 0 ? 10 : n);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
