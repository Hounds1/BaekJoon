package clear;

import java.util.Scanner;

public class b9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dummy = sc.nextLine();

        while (true) {
            if (!sc.hasNextLine())
                break;

            String target = sc.nextLine();
            String[] split = target.split("");

            if (split.length == 1) {
                System.out.println(split[0] + split[0]);
                continue;
            }

            System.out.println(split[0] + split[split.length - 1]);
        }

        sc.close();
    }
}
