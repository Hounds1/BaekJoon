package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class CraneGame {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        int[][] board = new int[range][range];

        for (int i = 0; i < range; i++) {
            board[i] = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int moveRange = Integer.parseInt(bufferedReader.readLine());
        int[] moves = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        int count = 0, tongs;

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            tongs = move - 1;

            for (int i = 0; i < range; i++) {
                if (board[i][tongs] != 0) {
                    int target = board[i][tongs];
                    board[i][tongs] = 0;

                    if (!stack.isEmpty() && stack.peek() == target) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.push(target);
                    }

                    break;
                }
            }
        }

        System.out.println(count);
    }
}
