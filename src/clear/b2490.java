package clear;

import java.util.Scanner;

public class b2490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            System.out.println(find(sc.nextLine().split(" ")));
        }
    }

    public static String find(String[] arr) {
        int count = 0;

        for (String s : arr) {
            if (s.equals("1"))
                count++;
        }

        if (count == 0)
            return "D";
        else if (count == 1)
            return "C";
        else if (count == 2)
            return "B";
        else if (count == 3)
            return "A";
        else if (count == 4)
            return "E";

        return null;
    }
}
