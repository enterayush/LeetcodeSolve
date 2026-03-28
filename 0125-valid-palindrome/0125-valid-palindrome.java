class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int left=0;
        int right =s.length()-1;
        while(left<=right){
            int first =s.charAt(left);
            int last = s.charAt(right);
            if(!Character.isLetterOrDigit(first)) left++;
            else if(!Character.isLetterOrDigit(last)) right--;
            else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)) return false;
                left++;
                right--;
            }
        }
        return true;

    }
}