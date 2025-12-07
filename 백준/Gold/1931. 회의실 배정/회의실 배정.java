import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        int[][] table = new int[len][2];
        for (int i = 0; i < len; i++) {
            int[] time = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            table[i][0] = time[0];
            table[i][1] = time[1];
        }

        // 회의 종료 시간 순으로 정렬 + 종료 시간 같으면 시작 시간으로
        Arrays.sort(table, Comparator.comparingInt((int[] o) -> o[1]).thenComparing((int[] o) -> o[0]));

        int cnt = 0;
        int beforeEnd = 0;
        for (int i = 0; i < len; i++) {
            int[] time = table[i];

            // 시작 시간이 마지막 종료 시간과 같거나 크면 선택 -> 회의 연쇄적으로 물림
            if (beforeEnd <= time[0]) {
                beforeEnd = time[1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}