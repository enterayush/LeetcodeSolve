class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;   
        //SUM METHOD
        // int sum=n*(n+1)/2;
        // int s2 = 0;
        // for(int i = 0; i<n;i++){
        //     s2 += nums[i];
        // }
        // return sum - s2;

        int xor =n;
        for(int i =0;i<n;i++){
            xor = xor^i^nums[i];
        }
        return xor;
        
    }
}