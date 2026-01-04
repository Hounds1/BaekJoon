import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        Arrays.sort(section);

        int answer = 0;

        int end = 0;
        for (int e : section) {
            if (e > end) {
                answer++;
                end = e + m - 1;
                if (end > n) end = n;
            }
        }

        return answer;
    }
}