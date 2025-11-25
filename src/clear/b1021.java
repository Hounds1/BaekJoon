package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class b1021 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] index = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int capacity = arr[0];

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= capacity; i++) {
            list.add(i);
        }

        int total = 0;
        for (final int target : index) {
            final int idx = list.indexOf(target);
            final int left = idx;
            final int right = list.size() - idx;

            // 같으면 무조건 좌회전으로
            if (left <= right) {
                // 좌측 거리 만큼 큐 회전 시킴.
                for (int j = 0; j < left; j++) {
                    list.addLast(list.removeFirst());
                    total++;
                }
            } else {
                // 아니면 우측 거리 만큼 큐 회전 시킴
                for (int j = 0; j < right; j++) {
                    list.addFirst(list.removeLast());
                    total++;
                }
            }

            // 탐색된 수 큐에서 제외 처리
            list.removeFirst();
        }

        System.out.println(total);
    }
}
