import java.util.Arrays;

class Solution {
        public static int solution(int k, int m, int[] score) {
            int answer = 0;
            Arrays.sort(score);

            for (int l = 0, r = score.length - 1; l < r; l++, r--) {
                int tmp = score[l];
                score[l] = score[r];
                score[r] = tmp;
            }

            final int len = score.length;

            final int localLen = len - len % m;
            for (int i = m - 1; i <= localLen; i += m) {
                answer += score[i] * m;
            }

            return answer;
        }
    }