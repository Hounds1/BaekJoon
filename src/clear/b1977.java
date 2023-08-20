package clear;

import java.util.Scanner;

public class b1977 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        sc.close();
        int[] answers = new int[2];

        int[] result = find(answers, start, end, 1, 10000);

        if (result[0] == 0 && result[1] == 0)
            System.out.println(-1);
        else
            for (int i : result)
                System.out.println(i);
    }

    public static int[] find(int[] answers, int start, int end, int routine, int min) {
        int pow = (int) Math.pow(routine, 2);
        if (pow > end)
            return answers;

        if (pow >= start && pow <= end) {
            answers[0] += pow;
            if (pow < min) {
                answers[1] = pow;
                min = pow;
            }
        }

        routine++;
        return find(answers, start, end, routine, min);
    }
}
