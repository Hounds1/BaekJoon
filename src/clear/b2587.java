package clear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b2587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                sc.close();
                break;
            }

            int num = Integer.parseInt(s);
            sum += num;
            count++;
            list.add(num);
        }

        System.out.println(sum/count);

        int[] array = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);
        int math = (int) Math.floor((double) array.length / 2);

        System.out.println(array[math]);
    }
}
