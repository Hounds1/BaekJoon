package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class b1340 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        LocalDateTime targetDateTime = createLocalDateTime(bufferedReader.readLine());

        if (targetDateTime.getMonth().getValue() == 1
                && targetDateTime.getDayOfMonth() == 1
                && targetDateTime.getHour() == 0
                && targetDateTime.getMinute() == 0) {
            System.out.println(0.0);

            return;
        }

        ZoneId zone = ZoneId.systemDefault();

        ZonedDateTime startOfYear = LocalDateTime.of(targetDateTime.getYear(), 1, 1, 0, 0).atZone(zone);
        ZonedDateTime endOfYear = LocalDateTime.of(targetDateTime.getYear(), 12, 31, 23, 59, 59, 999_999_999).atZone(zone);
        ZonedDateTime now = targetDateTime.atZone(zone);

        Duration yearsDuration = Duration.between(startOfYear.toInstant(), endOfYear.toInstant());
        Duration targetDuration = Duration.between(startOfYear.toInstant(), now.toInstant());

        double yearsRange = yearsDuration.getSeconds() * 1_000_000_000.0 + yearsDuration.getNano();
        double target = targetDuration.getSeconds() * 1_000_000_000.0 + targetDuration.getNano();


        System.out.println((target * 100.0) / yearsRange);
    }

    private static LocalDateTime createLocalDateTime(String target) {
        String[] dateArr = target.split(" ");

        String month = dateArr[0];
        int monthNumeric = getMonth(month);
        int day = Integer.parseInt(dateArr[1].replace(",", ""));
        int year = Integer.parseInt(dateArr[2]);

        String time = dateArr[3];
        String[] timeArr = time.split(":");

        int hour = Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);

        return LocalDateTime.of(year, monthNumeric, day, hour, minute);
    }

    private static int getMonth(String month) {
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
        }

        return 0;
    }
}
