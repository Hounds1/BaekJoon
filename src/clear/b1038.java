package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class b1038 {

    private static final List<Long> ENTRY = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int idx = Integer.parseInt(bufferedReader.readLine());
        if (idx == 0) {
            System.out.println(0);
            return;
        }

        final int limit = 1022;
        if (idx > limit) {
            System.out.println(-1);
            return;
        }


        for (int i = 0; i <= 9; i++) {
            dfs(i, i);
        }

        ENTRY.sort(Comparator.comparingLong(Long::longValue));

        System.out.println(ENTRY.get(idx));
    }

    public static void dfs(long last, long target) {
        ENTRY.add(target);

        /**
         * 재귀 호출로 모든 케이스 생성
         * dfs(3, 3) -> List >> [3] + 1 < 3 재귀 호출
         * dfs(3, 3) -> dfs(0, 30), dfs(1, 31), dfs(2, 32)
         * dfs(0, 30) -> List >> [3, 30] + i < 0으로 재귀 없이 즉시 탈출
         * dfs(1, 31) -> List >> [3, 30, 31] + i < 1로 i = 0 케이스 호출
         *             -> dfs(0, 310) -> List >> [3, 30, 31, 310] + i < 0으로 즉시 탈출
         * dfs(2, 32) -> List >> [3, 30, 31, 310, 32] + i < 2로 i = 0, 1 케이스 호출
         *             -> dfs(0, 320) -> List >> [3, 30, 31, 310, 32, 320] + i < 0으로 즉시 탈출
         *             -> dfs(1, 321) -> List >> [3, 30, 31, 310, 32, 320, 321] + i < 1로 재귀 호출
         *                  -> dfs(0, 3210) -> List >> [3, 30, 31, 310, 32, 320, 321, 3210] + i < 0으로 즉시 탈출
         *
         * 회종 엔트리 >> [3, 30, 31, 310, 32, 320, 321, 3210]
         */
        for (int i = 0; i < last; i++) {
            dfs(i, target * 10 + i);
        }
    }
}
