class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSdNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
    private boolean isSdNumber(int n) {
        int t = n;
        if (t == 0) {
            return false;
        }
        while (t > 0) {
            int u = t % 10;
            if (u == 0 || n % u != 0) {
                return false;
            }
            t /= 10;
        }
        return true;
    }
}