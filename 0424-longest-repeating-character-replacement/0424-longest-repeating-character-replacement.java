class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();
        int ans = 0;
        int maxi = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)-'A']++;
            maxi = Math.max(maxi , freq[s.charAt(i)-'A']);
            while ( (i-j+1) - maxi > k) {
                freq[s.charAt(j)-'A']--;
                j++;
            }
            ans = Math.max(ans, (i-j+1));
        }
        return ans;
    }
}