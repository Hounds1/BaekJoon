package clear;

import java.util.Scanner;

public class b2441 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();

        for(int i = 0; i < range; i++)  {
            for(int j = 1; j <= i; j++)  {
                System.out.print(" ");
            }
            for(int j = range; j > i; j--)  {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
