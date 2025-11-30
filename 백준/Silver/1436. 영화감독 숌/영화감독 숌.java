import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());
        if (target == 1) {
            System.out.println("666");
            return;
        }

        int idx = 1;
        int n = 666;
        while (idx != target) {
            n++;
            String val = String.valueOf(n);
            if (val.contains("666")) idx++;
        }

        System.out.println(n);
    }
}