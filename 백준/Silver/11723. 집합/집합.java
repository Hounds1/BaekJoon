import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] table = new int[20];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String[] split = bufferedReader.readLine().split(" ");

            switch (split[0]) {
                case "add" : {
                    table[Integer.parseInt(split[1]) - 1] = 1;
                    break;
                }
                case "remove" : {
                    table[Integer.parseInt(split[1]) - 1] = 0;
                    break;
                }
                case "check" : {
                    if (table[Integer.parseInt(split[1]) - 1] == 1) sb.append("1");
                    else sb.append("0");

                    sb.append("\n");
                    break;
                }
                case "toggle" : {
                    int num = Integer.parseInt(split[1]);
                    if (table[num - 1] == 1) table[num - 1] = 0;
                    else table[num - 1] = 1;
                    break;
                }
                case "all" : {
                    Arrays.fill(table, 1);
                    break;
                }
                case "empty" : {
                    Arrays.fill(table, 0);
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}