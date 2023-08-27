package clear;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class b2851 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();

        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();

            if (nextLine.isEmpty())
                break;

            list.add(Integer.parseInt(nextLine));
        }

        int now = 0;
        int middle = 100;
        int pre = 0;

        for (int i = 0; i < list.size(); i++) {
            if (now > middle)
                break;

            pre = now;
            now += list.get(i);
        }

        int min1 = Math.abs(middle - now);
        int min2 = Math.abs(middle - pre);

        if (min1 == min2) {
            System.out.println(now);
        } else if (min1 > min2) {
            System.out.println(pre);
        } else
            System.out.println(now);
    }
}
