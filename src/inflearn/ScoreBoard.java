package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreBoard {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();

        int score = 0;
        String[] board = bufferedReader.readLine().split(" ");

        int pointer1 = 1;
        int pointer2 = pointer1 - 1;

        if (board[0].equals("1")) {
            score++;
        }

        int temp = 1;
        while (pointer1 < board.length) {
            if (board[pointer1].equals("1") && board[pointer2].equals("1")) {
                temp++;
                score += temp;
            } else if (board[pointer1].equals("1")) {
                temp = 1;
                score += temp;
            }
            pointer1++;
            pointer2++;
        }

        System.out.println(score);
    }
}
