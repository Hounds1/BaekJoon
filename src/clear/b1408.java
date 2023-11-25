package clear;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class b1408 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter foramt = DateTimeFormatter.ofPattern("HH:mm:ss");

        int[] array = Arrays.stream(sc.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();
        LocalTime start = LocalTime.of(array[0], array[1], array[2]);

        int[] array1 = Arrays.stream(sc.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();
        LocalTime end = LocalTime.of(array1[0], array1[1], array1[2]);

        end = end.minusHours(start.getHour())
                .minusMinutes(start.getMinute())
                .minusSeconds(start.getSecond());

        System.out.println(end.format(foramt));
    }
}
