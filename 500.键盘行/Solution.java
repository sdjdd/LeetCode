class Solution {
    private Map<Character, Integer> map = new HashMap<>();
    
    public Solution() {
        for (char c : "qwertyuiop".toCharArray()) {
            map.put(c, 1);
        }
        for (char c : "asdfghjkl".toCharArray()) {
            map.put(c, 2);
        }
        for (char c : "zxcvbnm".toCharArray()) {
            map.put(c, 3);
        }
    }
    
    public String[] findWords(String[] words) {
        List<String> list = new LinkedList<>();
        loop1:
        for (String s : words) {
            int currentLine = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (currentLine == 0) {
                    currentLine = map.get(c);
                } else if (!map.get(c).equals(currentLine)) {
                    continue loop1;
                }
            }
            list.add(s);
        }
        String[] result = new String[list.size()];
        int i = 0;
        for (String s : list) {
            result[i] = s;
            i++;
        }
        return result;
    }
}