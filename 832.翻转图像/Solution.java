class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0, k = A[0].length-1; j <= k; j++, k--) {
                if (j == k) {
                    A[i][j] = (A[i][j]+1) % 2;
                } else if (A[i][j] == A[i][k]) {
                    A[i][j] = A[i][k] = (A[i][j]+1) % 2;
                }
            }
        }
        return A;
    }
}