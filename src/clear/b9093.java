package clear;

import java.util.Scanner;

public class b9093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            String[] words = sc.nextLine().split(" ");
            String answer = "";
            for (String s : words) {
                sb.append(s);
                answer += sb.reverse().toString();
                answer += " ";
                sb.setLength(0);
            }

            System.out.println(answer);
        }
    }
}
