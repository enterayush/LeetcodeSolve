class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
        
        // int left=0;
        // int right = nums.length-1;
        // while(left<right){
        //     int mid = left + (right - left) / 2;
        //     if (nums[mid] == target) {
        //         ans.add(mid);
        //         right = mid-1;
        //     }
        //     else if(nums[left]<target){
        //         right = mid -1;
        //     }
        //     else{
        //         left =mid+1;
        //     }
        // }
        // return ans;
    }
}