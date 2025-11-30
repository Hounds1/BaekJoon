import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int len =  arguments[0];
        final int weight = arguments[1];

        if (len == 0) {
            System.out.println(0);
            return;
        }

        int[] books = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0, now = 0;
        for (int i = 0; i < len; i++) {
            int book = books[i];
            // 애초에 책 무게 == 한도 같으면 박스++;
            if (weight == book) {
                cnt++;

                // 박스에 담겨있는 책들이 있으면 닫고 1개의 박스로 취급 -> 연속성 보장
                if (now > 0) {
                    cnt++;
                    now = 0;
                }
                continue;
            }

            now += book;
            // 더한 책 무게가 한도랑 같으면 박스++; + 현재 무게 초기화
            if (now == weight) {
                cnt++;
                now = 0;
                continue;
            }

            // 더한 책 무게가 한도 초과면 박스++; + 현재 값으로 무게 초기화
            if (now > weight) {
                cnt++;
                now = book;
            }
        }

        // 잔여 무게가 남아 있으면 박스로 쳐야함.
        System.out.println(now == 0 ? cnt : cnt + 1);
    }
}