package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b25305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");

        int total = Integer.parseInt(split[1]);

        int[] people = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(people);
        System.out.println(people[people.length - total]);
    }
}
