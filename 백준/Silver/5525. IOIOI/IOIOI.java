import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("IOI");
        sb.append("OI".repeat(Math.max(0, N - 1)));

        String target = sb.toString();
        sb.setLength(0);

        int len = Integer.parseInt(bufferedReader.readLine());
        String line = bufferedReader.readLine();

        int cnt = 0;
        int idx = 0;
        while (idx <= len - target.length()) {
            for (int i = idx; i < target.length() + idx; i++) {
                sb.append(line.charAt(i));
            }

            String str = sb.toString();

            if (str.equals(target)) cnt++;

            sb.setLength(0);
            idx++;
        }

        System.out.println(cnt);
    }
}