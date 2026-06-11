class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int m = 2*n;
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];

        }
        int a = n;
        for(int i=n-1;i>=0;i--){
            arr[a++] = nums[i];
            
        }
        return arr;

    }
}




