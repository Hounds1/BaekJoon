package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b2752 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();

        Arrays.sort(intArray);

        for (int i : intArray)
            System.out.print(i + " ");
    }
}
