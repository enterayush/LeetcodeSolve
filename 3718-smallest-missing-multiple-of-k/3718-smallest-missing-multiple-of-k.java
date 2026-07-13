class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)set.add(i);
        int ans = k;
        while(set.contains(ans)){
            ans += k;
        }
        return ans;
    }
}