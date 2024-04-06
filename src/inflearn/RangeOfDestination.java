package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RangeOfDestination {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] question = bufferedReader.readLine().split(" ");
        char[] targets = question[0].toCharArray();
        char destination = question[1].charAt(0);

        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < targets.length; i++) {
            int pointer1 = i == 0 ? 0 : i - 1;
            int pointer2 = i == targets.length - 1 ? targets.length - 1 : i + 1;

            while (true) {
                if (targets[i] == destination) {
                    answers.add(0);
                    break;
                }

                if (targets[pointer1] == destination) {
                    answers.add(Math.abs(pointer1 - i));
                    break;
                } else {
                    if (pointer1 > 0) {
                        pointer1--;
                    }
                }

                if (targets[pointer2] == destination) {
                    answers.add(Math.abs(pointer2 - i));
                    break;
                } else {
                    if (pointer2 < targets.length - 1) {
                        pointer2++;
                    }
                }
            }
        }

        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
