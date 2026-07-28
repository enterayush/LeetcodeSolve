class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        StringBuilder right = new StringBuilder();
            
        int[] freq = new int[26];
            
        for(char ch : s.toCharArray()) freq[ch - 'a']++;
        for(char ch ='a';ch<='z';ch++){
            while (freq[ch - 'a'] >= 2) {
                left.append(ch);
                freq[ch - 'a'] -= 2;
            }
            if (freq[ch - 'a'] == 1) {
                mid.append(ch);
            }
        }
        right.append(left).reverse();
        return left.toString() + mid.toString() + right.toString();
    }
}