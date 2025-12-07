import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len = arguments[0];
        final int target =  arguments[1];

        long[] trees = Arrays.stream(bufferedReader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Arrays.sort(trees);

        long min = 0;
        long max = trees[trees.length - 1];
        long temp = 0;

        while (min <= max) {
            long middle = (min + max) / 2;

            long sum = 0;
            for (long tree : trees) {
                if (tree > middle) sum += tree - middle;
            }

            if (sum >= target) {
                if (temp < middle) temp = middle;
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }

        System.out.println(temp);
    }
}