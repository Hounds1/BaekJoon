import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i][0] = nums[0];
            arr[i][1] = nums[1];
        }

        Arrays.sort(arr, Comparator.comparingInt((int[] e) -> e[1]).thenComparing(e -> e[0]));

        for (int[] nums : arr) {
            System.out.println(nums[0] + " " + nums[1]);
        }
    }
}