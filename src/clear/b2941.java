package clear;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String target = sc.nextLine();

        int count = 0;
        for (String s : alpha) {
            if (target.contains(s)) {
                Pattern p = Pattern.compile(s);
                Matcher m = p.matcher(target);

                int howMany = 0;
                while(m.find()) {
                    howMany++;
                }

                count += howMany;
                howMany = 0;
                target = target.replaceAll(s, " ");
            }
        }

        target = target.replaceAll(" ", "");
        System.out.println(count + target.length());
    }
}
