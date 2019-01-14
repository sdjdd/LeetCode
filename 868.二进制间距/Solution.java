class Solution {
    public int binaryGap(int N) {
        int last = -1, max = 0, i = 0;
        while (N > 0) {
            if (N % 2 == 1) {
                if (last >= 0) {
                    max = Math.max(max, i - last);
                }
                last = i;
            }
            N >>= 1;
            i++;
        }
        return max;
    }
}