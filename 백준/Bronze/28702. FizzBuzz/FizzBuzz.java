import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String fizzBuzz = "FizzBuzz";
        final String buzz = "Buzz";
        final String fizz = "Fizz";

        int num = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.isEmpty()) break;
            if (line.equals(fizzBuzz) ||  line.equals(buzz) || line.equals(fizz)) {
                num++;
            } else {
                num = Integer.parseInt(line);
            }
        }

        int after = num + 1;
        boolean a = after % 3 == 0;
        boolean b = after % 5 == 0;
        if (a && b) {
            System.out.println(fizzBuzz);
        } else if (a) {
            System.out.println(fizz);
        } else if (b) {
            System.out.println(buzz);
        } else {
            System.out.println(after);
        }
    }
}