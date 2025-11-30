import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < len; i++) {
            String line = bufferedReader.readLine();
            if (line.contains("push")) {
                queue.add(Integer.parseInt(line.replace("push ", "")));
                continue;
            }
            
            if (line.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.removeFirst()).append("\n");
                }
                continue;
            }

            if (line.equals("size")) {
                sb.append(queue.size()).append("\n");
                continue;
            }

            if (line.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                continue;
            }

            if (line.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.get(0)).append("\n");
                }
                continue;
            }

            if (line.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.get(queue.size() - 1)).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}