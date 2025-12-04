import java.time.LocalDate;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) throws Exception {
        LocalDate localDate = LocalDate.now(ZoneId.of("UTC"));

        int month = localDate.getMonthValue();
        System.out.println(localDate.getYear());
        System.out.println(month < 9 ? "0" + month : month);
        System.out.println(localDate.getDayOfMonth());
    }
}