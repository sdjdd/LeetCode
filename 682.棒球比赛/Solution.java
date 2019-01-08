class Solution {
    public int calPoints(String[] ops) {
        int[] ops2 = new int[1000];
        int length = 0, sum = 0;
        for (String s : ops) {
            switch (s) {
                case "C":
                    length--;
                    break;
                case "D":
                    ops2[length] = ops2[length - 1] * 2;
                    length++;
                    break;
                case "+":
                    ops2[length] = ops2[length - 1] + ops2[length - 2];
                    length++;
                    break;
                default:
                    ops2[length++] = Integer.parseInt(s);
            }
        }
        for (int i = 0; i < length; i++) {
            sum += ops2[i];
        }
        return sum;
    }
}