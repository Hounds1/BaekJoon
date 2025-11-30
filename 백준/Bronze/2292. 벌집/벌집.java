import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());
        if (target == 1) {
            System.out.println(1);
            return;
        }

        int round = 1, len = 1; // len 값은 각 라운드에서 마지막 방 번호 -> 초기값 1
        final int extend = 6; // 매 턴마다 늘어나는 방 갯수

        while (true) {
            if (len >= target) break;
            len = len + extend * round; // 매 턴마다 방 6개씩 늘려서 갱신
            round++;
        }

        System.out.println(round);
    }
}