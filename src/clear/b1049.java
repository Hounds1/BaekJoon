package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1049 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int broken = arguments[0];
        final int len =  arguments[1];

        int bundle = Integer.MAX_VALUE;
        int single = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            int[] vals = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            final int bundlePrice = vals[0];
            final int singlePrice = vals[1];

            if (bundlePrice < bundle) bundle = bundlePrice;
            if (singlePrice < single) single = singlePrice;
        }

        final int bundleQuantity = 6;

        int singleCost = broken * single;
        int bundleCnt = (broken + 5) / bundleQuantity;
        int bundleCost = bundleCnt * bundle;

        int bundlePart = broken / bundleQuantity;
        int singlePart = broken % bundleQuantity;
        int dualCost = bundlePart * bundle +  singlePart * single;

        System.out.println(Math.min(singleCost, Math.min(bundleCost, dualCost)));
    }
}
