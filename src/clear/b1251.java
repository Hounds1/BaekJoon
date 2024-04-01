package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class b1251 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine();

        List<String> parts = new ArrayList<>();

        for (int i = 2; i < target.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();

                sb1.append(target, 0, j).reverse();
                sb2.append(target, j, i).reverse();
                sb3.append(target.substring(i)).reverse();

                parts.add(sb1.toString() + sb2.toString() + sb3.toString());
            }
        }

        parts.sort(Comparator.naturalOrder());

        System.out.println(parts.get(0));
    }
}
