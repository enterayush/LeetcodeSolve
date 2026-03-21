class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original =x;
        if (x < 0) return false;
        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if(reversed == original) return true; 
        else return false;
    }
}