import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int heads = Integer.parseInt(bufferedReader.readLine());
        int[] sizes = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bundles = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int bundleT = bundles[0];
        final int bundleP = bundles[1];

        final int bp = heads / bundleP;
        final int sp = heads % bundleP;

        int totalBt = 0;
        for (int size : sizes) {
            if (size == 0) continue;

            if (size <= bundleT) totalBt++;

            if (size > bundleT) {
                if (size % bundleT != 0) totalBt += size / bundleT + 1;
                else totalBt += size / bundleT;
            }
        }

        System.out.println(totalBt);
        System.out.println(bp + " " + sp);
    }
}