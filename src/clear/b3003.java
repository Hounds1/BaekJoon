package clear;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class b3003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] normal = {1, 1, 2, 2, 2, 8};
        String[] now = sc.nextLine().split(" ");

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < normal.length; i++)  {
            int status = Integer.parseInt(now[i]);

            list.add(normal[i] - status);
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
