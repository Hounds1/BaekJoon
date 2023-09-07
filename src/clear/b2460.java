package clear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b2460 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int now = 0;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty())
                break;

            int[] intArr = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).parallel().toArray();

            now -= intArr[0];
            now += intArr[1];

            list.add(now);
        }

        int[] newIntArr = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(newIntArr);

        System.out.println(newIntArr[newIntArr.length - 1]);
    }
}
