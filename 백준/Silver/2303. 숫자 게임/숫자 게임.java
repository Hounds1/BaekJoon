import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        int[] table = new int[len];

        int max = 0;
        for (int i = 0; i < len; i++) {
            int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int temp = 0;
            final int localLen = arguments.length;
            for (int j = 0; j < localLen - 2; j++) {
                for (int k = j + 1; k < localLen - 1; k++) {
                    for (int l = k + 1; l < localLen; l++) {
                        int val =  arguments[j] + arguments[k] + arguments[l];

                        if (val < 10) {
                            if (val > temp) temp = val;
                        } else {
                            int mod = val % 10;
                            if (mod > temp) temp = mod;
                        }
                    }
                }
            }

            if (max < temp) max = temp;
            table[i] = temp;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (table[i] == max) list.add(i + 1);
        }

        if (list.size() == 1) System.out.println(list.get(0));
        else {
            list.sort(Collections.reverseOrder());
            System.out.println(list.get(0));
        }
    }
}