class Solution {
    public int solution(int a, int b) {
        int n = gcd(a, b);
        int m = b / n;

        while (m % 2 == 0) m /= 2;
        while (m % 5 == 0) m /= 5;

        if (m == 1) return 1;
        else return 2;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}