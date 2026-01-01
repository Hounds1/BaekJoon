import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String[] arguments = bufferedReader.readLine().split(" ");

            switch (arguments[0]) {
                case "push_front" : {
                    deque.addFirst(Integer.parseInt(arguments[1]));
                    break;
                }
                case "push_back" : {
                    deque.addLast(Integer.parseInt(arguments[1]));
                    break;
                }
                case "pop_front" : {
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.removeFirst()).append("\n");
                    break;
                }
                case  "pop_back" : {
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.removeLast()).append("\n");
                    break;
                }
                case "empty" : {
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                }
                case "size" : {
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "front" : {
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getFirst()).append("\n");
                    break;
                }
                case "back" : {
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getLast()).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}