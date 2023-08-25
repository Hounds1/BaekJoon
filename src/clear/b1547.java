package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b1547 {

    /**
     * 결국 공은 1번 컵에 담겨 있습니다.
     * 그 의미는 공의 위치가 계속 1번 컵을 따라간다는 의미일 것 입니다.
     * 따라서, 배열 내에서 오더에 따라 각 컵의 위치를 바꿔주고
     * 최종적으로 1번 컵의 위치를 찾는다면 공의 위치 또한 함께 찾게 됩니다.
     * 하지만, 컵의 순서와 배열의 순서는 다릅니다.
     * 컵은 1번 째 부터 세고 배열은 0번 째 부터 세어 나가기 때문에
     * 마지막에 배열의 위치를 컵의 위치로 보정하는 + 1이 필요합니다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());

        int[] location = {1, 2, 3};

        for (int i = 0; i < range; i++) {
            int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            location = temp(location, array[0] - 1, array[1] - 1);
        }

        for (int i = 0; i < location.length; i++) {
            if (location[i] == 1) {
                System.out.println(i+1);
                break;
            }
        }
    }

    public static int[] temp(int[] location, int move1, int move2) {
        int temp = location[move1];
        location[move1] = location[move2];
        location[move2] = temp;

        return location;
    }
}
