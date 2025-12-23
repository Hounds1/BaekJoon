class Solution {
        public static int[][] solution(int[][] arr1, int[][] arr2) {
            final int len1 = arr1[0].length;
            final int len2 = arr2[0].length;
            int[][] answer = new int[arr1.length][len2];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < len2; j++) {
                    int total = 0;
                    for (int k = 0; k < len1; k++) {
                        total += arr1[i][k] * arr2[k][j];
                    }

                    answer[i][j] = total;
                }
            }

            return answer;
        }
    }