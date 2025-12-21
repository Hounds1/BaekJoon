import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        final int len =  Integer.parseInt(bufferedReader.readLine());
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        
        list.sort(Comparator.comparingInt(Integer::intValue).reversed());

        StringBuilder sb = new StringBuilder();
        list.forEach(n -> sb.append(n).append("\n"));

        System.out.println(sb);
    }
}