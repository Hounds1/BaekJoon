package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Map<Integer, Boolean> reserveMap = new HashMap<>();

        for (int i : reserve) {
            reserveMap.put(i, true);
        }

        Map<Integer, Boolean> lostMap = new HashMap<>();

        for (int i : lost) {
            if (reserveMap.containsKey(i)) {
                reserveMap.remove(i);
            } else {
                lostMap.put(i, true);
            }
        }

        answer = n - lostMap.size();

        for (Map.Entry<Integer, Boolean> entry : lostMap.entrySet()) {
            if (reserveMap.containsKey(entry.getKey() - 1) && reserveMap.containsKey(entry.getKey() + 1)) {
                if (lostMap.containsKey(entry.getKey() - 2)) {
                    reserveMap.remove(entry.getKey() + 1);
                    answer++;
                    continue;
                } else {
                    reserveMap.remove(entry.getKey() - 1);
                    answer++;
                    continue;
                }
            }

            if (reserveMap.containsKey(entry.getKey() - 1)) {
                reserveMap.remove(entry.getKey() - 1);
                answer++;
                continue;
            }

            if (reserveMap.containsKey(entry.getKey() + 1)) {
                reserveMap.remove(entry.getKey() + 1);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        GymSuit main = new GymSuit();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] lost = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] reserve = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = main.solution(n, lost, reserve);

        System.out.println(answer);
    }
}
