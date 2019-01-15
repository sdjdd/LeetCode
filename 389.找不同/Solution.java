class Solution {
    public char findTheDifference(String s, String t) {
        int n = 0;
        for (char c : s.toCharArray()) {
            n ^= c - 'a';
        }
        for (char c : t.toCharArray()) {
            n ^= c - 'a';
        }
        return (char) ('a' + n);
    }
}