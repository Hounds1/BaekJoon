import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("0 0 0")) break;

            int[] nums = Arrays.stream(Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray()).sorted().toArray();

            BigInteger t = new BigInteger(String.valueOf(nums[0])).pow(2).add(new BigInteger(String.valueOf(nums[1])).pow(2));

            System.out.println(t.equals(new BigInteger(String.valueOf(nums[2])).pow(2)) ? "right" : "wrong");
        }
    }
}