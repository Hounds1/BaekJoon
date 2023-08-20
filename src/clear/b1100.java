package clear;

import java.util.Scanner;

public class b1100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int line = 0;
        int range = 8;

        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.isEmpty())
                break;

            String[] split = nextLine.split("");

            if (line % 2 == 0) {
                for (int i = 0; i < range; i++) {
                    if (split[i].equals("F") && i % 2 == 0)
                        count++;
                }
            } else if (line % 2 != 0) {
                for (int i = 0; i < range; i++) {
                    if (split[i].equals("F") && i % 2 != 0)
                        count++;
                }
            }

            line++;
        }

        System.out.println(count);
    }
}
