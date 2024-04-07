package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IsPeaks {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int[][] mountain = new int[range][range];

        for (int i = 0; i < mountain.length; i++) {
            mountain[i] = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int count = 0;

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < range && ny >= 0 && ny < range && mountain[nx][ny] >= mountain[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
