import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int len1 =  arguments[0];
        final int len2 = arguments[1];

        Map<Integer, String> pokeDexNumber = new HashMap<>();
        Map<String, Integer> pokeDexName = new HashMap<>();
        for (int i = 1; i <= len1; i++) {
            String name = bufferedReader.readLine();
            pokeDexNumber.put(i, name);
            pokeDexName.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= len2; i++) {
            String line = bufferedReader.readLine();

            boolean isDigit = false;
            for (int j = 0; j < line.length(); j++) {
                if (Character.isDigit(line.charAt(j))) {
                    isDigit = true;
                    break;
                }
            }

            if (isDigit) {
                String pokemon = pokeDexNumber.get(Integer.parseInt(line));
                sb.append(pokemon).append("\n");
            } else {
                Integer number = pokeDexName.get(line);
                sb.append(number).append("\n");
            }
        }

        System.out.println(sb);
    }
}