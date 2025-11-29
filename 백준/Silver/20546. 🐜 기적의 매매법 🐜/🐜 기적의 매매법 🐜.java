import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String BNP = "BNP";
        final String TIMING = "TIMING";
        final String SAME = "SAMESAME";

        int seed = Integer.parseInt(bufferedReader.readLine());

        int jh = seed, sm = seed, jhStock = 0, smStock = 0;

        int[] chart = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < chart.length; i++) {
            final int today = chart[i];

            if (jh >= today) {
                int stock = jh / today;
                jhStock += stock;
                jh -= stock * today;
            }

            if (i > 2) {
                if (chart[i - 3] < chart[i - 2] && chart[i - 2] < chart[i - 1] && chart[i - 1] < today) {
                    sm += smStock * today;
                    smStock = 0;
                }

                if (chart[i - 3] > chart[i - 2] && chart[i - 2] > chart[i - 1] && chart[i - 1] > today && sm >= today) {
                    int stock = sm / today;
                    smStock += stock;
                    sm -= stock * today;
                }
            }
        }

        final int jhTotal = jh + (jhStock * chart[chart.length - 1]);
        final int smTotal = sm + (smStock * chart[chart.length - 1]);

        if (jhTotal == smTotal) System.out.println(SAME);
        if (jhTotal > smTotal) System.out.println(BNP);
        if (smTotal > jhTotal) System.out.println(TIMING);
    }
}