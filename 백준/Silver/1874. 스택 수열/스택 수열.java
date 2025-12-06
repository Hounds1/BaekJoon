import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        boolean printSb = true;
        int now = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int target = arr[i];

            // 목표까지 순차적으로 밀어넣기(목표보다 크면 패스)
            while (now <= target) {
                stack.push(now);
                sb.append("+\n");
                now++;
            }

            // 스책 가장 위 값이 목표 값이랑 다르면 실패 처리
            if (stack.isEmpty() || stack.peek() != target) {
                printSb = false;
                break;
            }

            stack.pop();
            sb.append("-\n");
        }

        if (printSb) System.out.println(sb);
        else System.out.println("NO");
    }
}