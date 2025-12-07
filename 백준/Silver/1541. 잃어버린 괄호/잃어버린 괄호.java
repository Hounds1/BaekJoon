import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 더할 수 있는 값은 다 더하고 첫 값에서 순차적으로 다 빼면 됨.
 * 배치된 순서를 바꿀 수 없기 때문에 무조건 첫 번째 값에서 이어지는 값들을 빼는 방식.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        String[] split = line.split("-");

        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Arrays.stream(split[i].split("\\+")).mapToInt(Integer::parseInt).sum();;
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            start -=  nums[i];
        }

        System.out.println(start);
    }
}