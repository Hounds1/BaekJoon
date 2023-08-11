package clear;

import java.util.Scanner;

public class b2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dummy = sc.nextLine();

        while (sc.hasNextLine()) {

            String[] targets = sc.nextLine().split(" ");
            int range = Integer.parseInt(targets[0]);

            String[] list = targets[1].split("");

            for (String s : list) {
                String result = "";
                for (int i = 0; i < range; i++) {
                    result += s;
                }

                System.out.print(result);
            }
            System.out.println(" ");
        }

        sc.close();
    }
}
