package clear;

import java.util.Scanner;

public class b10952 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            if (arr[0].equals("0") && arr[1].equals("0"))
                break;

            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}
