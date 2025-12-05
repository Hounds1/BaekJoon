import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(bufferedReader.readLine());

        if (target == 1 || target == 2 || target == 4 || target == 7) {
            System.out.println(-1);
            return;
        }

        final int big = 5;
        final int small = 3;

        int max = target / big;
        int min = 0;
        if (target % big == 0) {
            System.out.println(max);
            return;
        }

        if ((target - (max * big) % small) == 0) {
            System.out.println(max + target - (max * big) / small);
            return;
        }

        while (true) {
            int remain = target - (max * big);
            if (remain % small == 0) {
                System.out.println(max + (remain / small));
                break;
            }

            max--;
        }
    }
}