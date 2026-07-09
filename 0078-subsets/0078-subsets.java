class Solution {
    void solve(int ind, int[] nums, List<Integer> curr,  List<List<Integer>> res){
        if(ind >= nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[ind]);
        solve(ind+1, nums, curr, res);
        curr.remove(curr.size()-1);
        solve(ind+1, nums, curr, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), res);
        return res;
    }
}