import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int len = Integer.parseInt(bufferedReader.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < len; i++) {
            final int num = arr[i];

            if (num == 0) {
                list.addLast(i + 1);
                continue;
            }

            if (num == list.size()) {
                list.addFirst(i + 1);
                continue;
            }

            list.add(list.size() - num, i + 1);
        }

        list.forEach(e -> System.out.print(e + " "));
    }
}