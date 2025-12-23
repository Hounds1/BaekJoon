class Solution {
        public static long solution(int k, int d) {
            long answer = 0;

            long sqrt = (long) d * d;
            long y = d;

            // i -> x축
            for (int i = 0; i <= d; i += k) {
                while (((long) i * i + y * y) > sqrt) y--;
                answer += (y / k) + 1;
            }

            return answer;
        }
    }