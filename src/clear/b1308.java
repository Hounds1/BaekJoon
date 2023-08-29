package clear;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class b1308 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] beforeArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();
        LocalDate before = LocalDate.of(beforeArray[0], beforeArray[1], beforeArray[2]);

        int[] afterArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).parallel().toArray();
        LocalDate after = LocalDate.of(afterArray[0], afterArray[1], afterArray[2]);

        long years = ChronoUnit.YEARS.between(before, after);
        long between = ChronoUnit.DAYS.between(before, after);

        if (years >= 1000)
            System.out.println("gg");
        else
            System.out.println("D-" + between);
    }
}
