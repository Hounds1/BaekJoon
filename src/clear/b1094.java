package clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1094 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stick = 64;
        int count = 0;

        try {
            int target = Integer.parseInt(br.readLine());

            while (target != 0) {
                if (target < stick) {
                    stick /= 2;
                } else {
                    target -= stick;
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(count);
    }
}
