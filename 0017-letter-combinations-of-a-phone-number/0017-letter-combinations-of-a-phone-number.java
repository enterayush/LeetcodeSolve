class Solution {
    void solve(int ind, String digits, Map<Integer,String>map, List<String> ans, StringBuilder ds){
        if(ind == digits.length()){
            ans.add(ds.toString());
            return;
        }
        int digit = digits.charAt(ind) - '0';
        String letter = map.get(digit);
        for(int i =0;i<letter.length();i++){
            ds.append(letter.charAt(i));
            solve(ind+1, digits, map, ans, ds);
            ds.deleteCharAt(ds.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        Map<Integer,String>map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqsr");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        solve(0, digits, map, ans, new StringBuilder());
        return ans;
    }
}