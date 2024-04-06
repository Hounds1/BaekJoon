package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WhoIsWinner {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> gameMap = generateMap();

        int range = Integer.parseInt(bufferedReader.readLine());
        String[] targetA = bufferedReader.readLine().split(" ");
        String[] targetB = bufferedReader.readLine().split(" ");

        for (int i = 0; i < range; i++) {
            if (targetA[i].equals(targetB[i])) {
                System.out.println("D");
                continue;
            }

            String result = gameMap.get(targetA[i]);

            if (result.equals(targetB[i])) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    public static Map<String, String> generateMap() {
        Map<String, String> gameMap = new HashMap<>();

        gameMap.put("1", "3");
        gameMap.put("2", "1");
        gameMap.put("3", "2");

        return gameMap;
    }
}
