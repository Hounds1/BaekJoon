 class Solution {
        public static long solution(int[] arr) {
            long answer = arr[0];
            final int len = arr.length;

            for (int i = 1; i < len; i++) {
                if (arr[i] == 0) return 0;
                answer = answer / gcd(answer, arr[i]) * arr[i];
            }

            return answer;
        }

        public static long gcd(long a, long b) {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }
    }