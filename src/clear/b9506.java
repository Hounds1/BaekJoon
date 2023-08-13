package clear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b9506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int target = Integer.parseInt(sc.nextLine());
            if (target == -1)
                break;

            List<Integer> list = new ArrayList<>();
            int valid = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    list.add(i);

                    if (i != target)
                        valid += i;
                }
            }

            if (valid == target) {
                System.out.print(target + " = ");
                for (int i = 0; i < list.size()-1; i++) {
                    System.out.print(list.get(i));
                    if (i < list.size() - 2)
                        System.out.print(" + ");
                }
                System.out.println(" ");
            } else
                System.out.println(target + " is NOT perfect.");
        }

        sc.close();
    }
}
