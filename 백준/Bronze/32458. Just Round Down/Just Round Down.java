import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        System.out.println(line.substring(0, line.indexOf(".")));
    }
}