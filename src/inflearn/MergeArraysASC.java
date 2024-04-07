package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeArraysASC {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int firRange = Integer.parseInt(bufferedReader.readLine());
        int[] fir = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int secRange = Integer.parseInt(bufferedReader.readLine());
        int[] sec = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int pointer1 = 0, pointer2 = 0;

        List<Integer> list = new LinkedList<>();

        while (pointer1 < firRange && pointer2 < secRange) {
            if (fir[pointer1] < sec[pointer2]) {
                list.add(fir[pointer1++]);
            } else {
                list.add(sec[pointer2++]);
            }
        }

        while (pointer1 < firRange) {
            list.add(fir[pointer1++]);
        }

        while (pointer2 < secRange) {
            list.add(sec[pointer2++]);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
