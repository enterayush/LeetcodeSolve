class Solution {
    public int maxSubArray(int[] nums) {
        // KADANE's Algorithm
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int n:nums){
            sum +=n;

            if(sum>maxi) maxi = sum;
            if(sum<0) sum =0;
        }
        return maxi;
    }
}