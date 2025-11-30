import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[len];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr) {
            builder.append(i).append("\n");
        }

        System.out.println(builder);
    }
}