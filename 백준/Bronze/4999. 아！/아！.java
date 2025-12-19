import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(bufferedReader.readLine().length() >= bufferedReader.readLine().length() ? "go" : "no");
    }
}