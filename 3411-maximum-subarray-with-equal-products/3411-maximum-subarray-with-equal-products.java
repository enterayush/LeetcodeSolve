class Solution {
    public int maxLength(int[] nums) {
            int max=0;
        for(int i =0;i<nums.length;i++){
            int prod = 1;
            int gcd=0;
            int lcm=1;
            for(int j=i;j<nums.length;j++){
                gcd = gcd(gcd,nums[j]);
                lcm = (nums[j]*lcm)/gcd(lcm,nums[j]);
                prod *= nums[j];

                if(prod == gcd*lcm){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}