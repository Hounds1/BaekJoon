package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b4101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (array[0] == 0 && array[1] == 0)
                break;

            System.out.println(array[0] > array[1] ? "Yes" : "No");
        }
    }
}
