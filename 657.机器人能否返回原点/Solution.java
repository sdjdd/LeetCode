class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;
        if (moves.length() % 2 != 0) {
            return false;
        }
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
            }
        }
        return r == l && u == d;
    }
}