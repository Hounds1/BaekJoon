package clear;

import java.util.*;

public class b1362 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> answerList = new ArrayList<>();
        final String END = "0 0";
        final String POINT = "# 0";

        List<String> targets = new LinkedList<>();
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.equals(END))
                break;

            if (nextLine.equals(POINT)) {
                answerList.add(initiate(targets));
                targets.clear();
            } else {
                targets.add(nextLine);
            }
        }

        int i = 1;
        for (String s : answerList) {
            System.out.println(i + " " + s);
            i++;
        }
    }

    private static String initiate(List<String> targets) {
        final String DEAD = "RIP";
        final String HAPPY = ":-)";
        final String SAD = ":-(";

        int o, w, max, min = 0;
        int[] weight = Arrays.stream(targets.get(0).split(" ")).mapToInt(Integer::parseInt).toArray();
        o = weight[0];
        w = weight[1];
        max = o * 2;
        min = o / 2;

        targets.remove(0);

        for (String target : targets) {
            String[] split = target.split(" ");
            if (split[0].equals("E"))
                w -= Integer.parseInt(split[1]);
            else
                w += Integer.parseInt(split[1]);

            if (w <= 0) {
                return DEAD;
            }
        }

        return w > min && w < max ? HAPPY : SAD;
    }
}
