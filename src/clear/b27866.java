package clear;

import java.util.Scanner;

public class b27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] target = sc.nextLine().split("");
        System.out.println(target[Integer.parseInt(sc.nextLine()) - 1]);
    }
}
