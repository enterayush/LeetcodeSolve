class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - '0']++;
        }
        for (int i = 0; i + 1 < s.length(); i++) {

            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';

            if (a != b &&
                freq[a] == a &&
                freq[b] == b) {

                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }
        return "";
    }
}