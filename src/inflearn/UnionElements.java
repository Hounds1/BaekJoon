package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionElements {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> answer = new ArrayList<>();

        int rangeFir = Integer.parseInt(bufferedReader.readLine());

        int[] arrFir = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arrFir);

        int rangeSec = Integer.parseInt(bufferedReader.readLine());

        int[] arrSec = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arrSec);

        bufferedReader.close();

        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < rangeFir && pointer2 < rangeSec) {
            if (arrFir[pointer1] == arrSec[pointer2]) {
                answer.add(arrFir[pointer1++]);
                pointer2++;
            } else if (arrFir[pointer1] < arrSec[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
