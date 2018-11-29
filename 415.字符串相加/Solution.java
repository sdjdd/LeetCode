class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer buf = new StringBuffer();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int sum = 0;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 >= 0) {
                sum += num1.charAt(index1) - '0';
                index1--;
            }
            if (index2 >= 0) {
                sum += num2.charAt(index2) - '0';
                index2--;
            }
            if (sum < 10 ) {
                buf.append(sum);
                sum = 0;
            } else {
                buf.append(sum % 10);
                sum = 1;
            }
        }
        if (sum > 0) {
            buf.append(sum);
        }
        return buf.reverse().toString();
    }
}