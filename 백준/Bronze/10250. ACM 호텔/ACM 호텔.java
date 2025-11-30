import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            final int H =  arguments[0];
            final int N =  arguments[2];

            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;

            System.out.println(floor * 100 + room);
        }
    }
}