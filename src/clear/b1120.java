package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1120 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] targets = bufferedReader.readLine().split(" ");

        String[] target1 =  targets[0].split("");
        String[] target2 = targets[1].split("");

        int min = Integer.MAX_VALUE;

        final int lenT1 = target1.length;
        final int lenT2 = target2.length;

        /**
         *  A를 앞,뒤로 연장할 때 B의 범위 밖 나머지 원소로 A를 채울 수 있다 -> 차이를 0로 만들 수 있음.
         *  A를 B 위에 한 칸씩 밀어가며 올려서 대조 -> 가장 작은 차이 값을 정답으로 결정
         *  lenT2 - lenT1 => 밀어낼 수 있는 최대 인덱스 수
         */
        for (int s = 0; s <= lenT2 - lenT1; s++) {
            int temp = 0;

            for (int i = 0; i < lenT1; i++) {
                if (!target1[i].equals(target2[s + i])) temp ++;
            }

            if (temp < min) min = temp;
        }

        System.out.println(min);
    }
}
