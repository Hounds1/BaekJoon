import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[len];

        int total = 0;
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());

            if (num == 0) {
                arr[i] = num;
                for (int j = i - 1; j >= 0; j--) {
                    int element = arr[j];
                    if (element != 0) {
                        arr[j] = 0;
                        total -= element;
                        break;
                    }
                }
            } else {
                arr[i] = num;
                total += num;
            }
        }

        System.out.println(total);
    }
}