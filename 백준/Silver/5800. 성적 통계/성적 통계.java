import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            final int innerLen = arr[0];
            int max = 0, min = Integer.MAX_VALUE, gap = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= innerLen; j++) {
                final int score = arr[j];
                if (score > max) {
                    max = score;
                }

                if (score < min) {
                    min = score;
                }

                list.add(score);
            }

            list.sort(Comparator.comparingInt(Integer::intValue).reversed());
            for (int k = 0; k < list.size() - 1; k++) {
                Integer score = list.get(k);

                int gap1 = Math.abs(list.get(k + 1) - score);
                if (gap1 > gap) gap = gap1;
            }

            System.out.println("Class" + " " + (i + 1));
            System.out.println("Max " + max + ", " + "Min " + min + ", " + "Largest gap " + gap);
        }
    }
}