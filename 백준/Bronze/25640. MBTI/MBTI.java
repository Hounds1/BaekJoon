import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine();

        final int len = Integer.parseInt(bufferedReader.readLine());
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            elements.add(bufferedReader.readLine());
        }

        System.out.println(elements.stream().filter(e -> e.equals(target)).collect(Collectors.toList()).size());
    }
}