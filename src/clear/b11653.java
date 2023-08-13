package clear;

import java.util.Scanner;

public class b11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        cowInSuBunHae(target, 2);

        sc.close();
    }

    public static void cowInSuBunHae(int target, int num) {
        if (target == 1)
            return;

        if (target % num == 0) {
            System.out.println(num);
            target = target / num;
        } else if (target % num != 0){
            num++;
        }

        cowInSuBunHae(target, num);
    }
}
