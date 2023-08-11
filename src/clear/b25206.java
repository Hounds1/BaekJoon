package clear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b25206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < grade.length; i++) {
            map.put(grade[i], score[i]);
        }

        double total = 0.0;
        double totalGrade = 0.0;
        int range = 20;

        for (int i = 0; i < range; i++) {
            String[] split = sc.nextLine().split(" ");
            if (!split[2].equals("P")) {
                double target = Double.parseDouble(split[1]);
                total += target * map.get(split[2]);
                totalGrade += target;
            }
        }

        System.out.println(total / totalGrade);
    }
}
