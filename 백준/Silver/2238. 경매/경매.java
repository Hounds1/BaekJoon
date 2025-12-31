import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int high = arguments[0];
        final int len = arguments[1];

        int[] count = new int[high + 1];
        String[] firstName = new String[high + 1];

        for (int i = 0; i < len; i++) {
            String[] values = bufferedReader.readLine().split(" ");
            String name = values[0];
            int price = Integer.parseInt(values[1]);

            count[price]++;
            if (count[price] == 1) firstName[price] = name;
        }

        int bestPrice = -1;
        int minCnt = Integer.MAX_VALUE;

        for (int price = 1; price <= high; price++) {
            if (count[price] == 0) continue;

            if (count[price] < minCnt) {
                minCnt = count[price];
                bestPrice = price;
            } else if (count[price] == minCnt && price < bestPrice) {
                bestPrice = price;
            }
        }

        System.out.println(firstName[bestPrice] + " " + bestPrice);
    }
}