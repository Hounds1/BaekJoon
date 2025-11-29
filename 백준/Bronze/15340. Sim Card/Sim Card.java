import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int[] entry = {30, 40, 35, 30, 40, 20};

        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("0 0")) break;;

            int min = Integer.MAX_VALUE;
            int[] vals = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < entry.length; i += 2) {
                int temp = vals[0] * entry[i] + vals[1] * entry[i + 1];

                if (min > temp) min = temp;
            }

            System.out.println(min);
        }
    }
}