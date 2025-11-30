import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = bufferedReader.readLine();
        String num2 = bufferedReader.readLine();
        int num3 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2) - num3);
        System.out.println(Integer.parseInt(num1 + num2) - num3);
    }
}