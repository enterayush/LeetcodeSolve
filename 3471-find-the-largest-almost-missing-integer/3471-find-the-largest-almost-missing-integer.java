class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int n = nums.length;
        for(int i:nums){
                freq[i]++;
            }
        if(k==n){
            int max = -1;
            for(int i : nums){
                max = Math.max(max,i);
            }
            return max;
        }
        if(k == 1){
            int max = -1;
            for(int i:nums){
                if(freq[i] == 1){
                    max = Math.max(max,i);
                }
            }
            return max;
        }
        int ans = -1;  //this is for 1<k<n

        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}