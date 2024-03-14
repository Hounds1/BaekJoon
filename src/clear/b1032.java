package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b1032 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> targets = new ArrayList<>();
        initList(br, targets);

        StringBuilder sb = new StringBuilder();

        int range = targets.get(0).length();

        for (int i = 0; i < range; i++) {
            List<Character> subList = new ArrayList<>();
            for (String target : targets) {
                subList.add(target.charAt(i));
            }

            if (isMatches(subList))
                sb.append(targets.get(0).charAt(i));
            else
                sb.append("?");
        }

        System.out.println(sb);
    }

    private static boolean isMatches(List<Character> subList) {
        int before = subList.get(0);

        for (Character character : subList) {
            int num = character;

            if (before != num) {
                return false;
            } else {
                before = num;
            }
        }

        return true;
    }

    public static void initList(BufferedReader br, List<String> targets) {
        try {
            int range = Integer.parseInt(br.readLine());

            for (int i = 0; i < range; i++)  {
                targets.add(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
