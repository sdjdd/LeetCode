class Solution {

    private String[] morse = new String[] {
            ".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        StringBuilder buf = new StringBuilder();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                buf.append(morse[c - 'a']);
            }
            set.add(buf.toString());
            buf.delete(0, buf.length());
        }
        return set.size();
    }
}