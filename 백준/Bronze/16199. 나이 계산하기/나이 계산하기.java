import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] birth = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] std = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int year = std[0] - birth[0];
        LocalDate stdDate = LocalDate.of(std[0], std[1], std[2]);

        // case 1
        if (year == 0) {
            System.out.println(0);
        } else {
            LocalDate temp = LocalDate.of(std[0], birth[1], birth[2]);
            if (stdDate.isBefore(temp))System.out.println(year - 1);
            else System.out.println(year);
        }
        
        // case 2
        System.out.println(year + 1);

        // case 3
        System.out.println(year);
    }
}