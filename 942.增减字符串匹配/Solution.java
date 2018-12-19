class Solution {
    public int[] diStringMatch(String S) {
        int[] result = new int[S.length() + 1];
        int min = 0, max = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i + 1] = max + 1;
                max++;
            } else {
                result[i + 1] = min - 1;
                min--;
            }
        }
        if (min < 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] -= min;
                max++;
            }
        }
        return result;
    }
}
