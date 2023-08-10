package clear;

import java.util.Scanner;

public class b10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (!sc.hasNextLine())
                break;

            String str = sc.nextLine();

            String[] arr = str.split(" ");

            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }

        sc.close();
    }
}
