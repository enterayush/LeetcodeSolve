class Solution {
    boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    void backtrack(int ind, String s, List<List<String>> ans, List<String> ds){
        if(ind == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i<s.length(); i++){
            if(isPalindrome(s, ind, i)){
                ds.add(s.substring(ind, i+1));
                backtrack(i+1, s, ans, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(0, s, ans, new ArrayList<>());
        return ans;
    }
}