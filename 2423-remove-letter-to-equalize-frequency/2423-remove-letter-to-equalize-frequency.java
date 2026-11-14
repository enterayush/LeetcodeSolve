class Solution {
    boolean isSame(int[] freq) {
        int common = -1;
        for (int f : freq) {
            if (f == 0)
                continue;
            if (common == -1) {
                common = f;
            } else if (common != f) {
                return false;
            }
        }
        return true;
    }

    public boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            int[] freq = new int[26];
            for (int j = 0; j < word.length(); j++) {
                if (i == j)
                    continue;
                freq[word.charAt(j) - 'a']++;
            }
            if (isSame(freq)) {
                return true;
            }
        }
        return false;
    }
}