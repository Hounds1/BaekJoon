package clear;

import java.util.Scanner;

public class b25314 {

    public static String solution() {
        Scanner sc = new Scanner(System.in);

        int target = Integer.parseInt(sc.nextLine());
        int range = target / 4;

        String result = "";

        for (int i = 0; i < range; i++) {
            result += "long ";
        }

        result += "int";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
