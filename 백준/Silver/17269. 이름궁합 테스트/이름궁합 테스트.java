import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int[] STROKES = { 3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1 };

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int len1 = arguments[0];
        final int len2 = arguments[1];

        final int localLen = len1 + len2;
        int[] arr = new int[localLen];

        int min = Math.min(len1, len2);
        int idx = 0;

        String[] names = bufferedReader.readLine().split(" ");

        for (int i = 0; i < min; i++) {
            arr[idx++] = STROKES[names[0].charAt(i) - 'A'];
            arr[idx++] = STROKES[names[1].charAt(i) - 'A'];
        }

        if (len1 > len2) {
            for (int i = min; i < len1; i++) arr[idx++] = STROKES[names[0].charAt(i) - 'A'];
        } else {
            for (int i = min; i < len2; i++) arr[idx++] = STROKES[names[1].charAt(i) - 'A'];
        }

        int curLen = localLen;
        while (curLen > 2) {
            for (int i = 0; i < curLen - 1; i++) {
                arr[i] = (arr[i] + arr[i + 1]) % 10;
            }
            curLen--;
        }

        if (arr[0] == 0) System.out.println(arr[1] + "%");
        else System.out.println("" + arr[0] + arr[1] + "%");
    }
}