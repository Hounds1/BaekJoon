import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            list.add(i + 1);
        }

        while (list.size() != 1) {
            list.removeFirst();
            list.addLast(list.removeFirst());
        }

        System.out.println(list.get(0));
    }
}