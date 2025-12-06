import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 주어진 배열 자체를 온전한 체스판으로 만드는 것이 아닌 8x8의 체스판으로 만드는 경우
     * 배열 내부에서 어떤 부분을 잘라내어 칠했을 때 가장 적은 칠을 할 수 있냐는 문제.
     *
     * 즉, 잘라낸 나머지 영역은 다 버리고 8x8 짜리 체스판을 만드려고 할 때
     * 어떤 부분을 잘라야 가장 적게 색칠할 수 있냐는 문제.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len1 =  arguments[0];
        final int len2 = arguments[1];

        char[][] board =  new char[len1][len2];
        for (int i = 0; i < len1; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < len2; j++) board[i][j] = line.charAt(j);
        }

        final char white = 'W';
        final char black = 'B';

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= len1 - 8; i++) {
            for (int j = 0; j <= len2 - 8; j++) {
                int pw = 0;
                int pb = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char target = board[i + k][j + l];

                        boolean isEven = (k + l) % 2 == 0;
                        if (isEven) {
                            if (target != white) pw++;
                            if (target != black) pb++;
                        } else {
                            if (target != black) pw++;
                            if (target != white) pb++;
                        }
                    }
                }

                int minCnt = Math.min(pw, pb);
                if (min > minCnt) min =  minCnt;
            }
        }

        System.out.println(min);
    }
}