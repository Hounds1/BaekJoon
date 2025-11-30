import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        if (len == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        int round = (int) Math.round(len * 0.15);
        int total = 0;
        for (int i = round; i < len - round; i++) {
            total +=  arr[i];
        }

        System.out.println((int) Math.round((double) total / (len - round * 2)));
    }
}