package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Recursive {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());
        List<Integer> answers = new ArrayList<>();
        answers.add(1);

        generate(range, 1, answers, 1, 0);

        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public static List<Integer> generate(int range, int round, List<Integer> answers, int current, int previous) {
        if (range == round) {
            return answers;
        }

        int newCurrent = previous + current;
        answers.add(newCurrent);

        int temp = current;
        current = newCurrent;
        previous = temp;
        round++;

        return generate(range, round, answers, current, previous);
    }
}
