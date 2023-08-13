package clear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b1024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int L = Integer.parseInt(split[1]);

        List<Integer> result = find(N, L);

        if (result != null) {
            for (int i : result)
                System.out.print(i + " ");
        }

        sc.close();
    }

    public static List<Integer> find(int N, int L) {
        List<Integer> integerList = new ArrayList<>();

        for (int length = L; length <= 100; length++) {
            int start = (2 * N - length * (length - 1)) / (2 * length);

            if (start >= 0 && (2 * N == length * (2 * start + length - 1))) {
                for (int i = start; i < start + length; i++) {
                    integerList.add(i);
                }
                return integerList;
            }
        }

        System.out.print(-1);
        return null;
    }
}
