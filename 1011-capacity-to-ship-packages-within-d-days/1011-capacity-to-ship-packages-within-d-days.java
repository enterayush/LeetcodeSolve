class Solution {
    boolean check(int[]weights,int cap,int days){
        int day = 1;
        int load = 0;
        for(int i=0;i<weights.length;i++){
            if(load + weights[i] > cap){
                day++;
                load = weights[i];
            }else load +=weights[i];
        }
        return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int sum=0;
        for(int num:weights){
            sum +=num;
            left = Math.max(num,left);
            right = sum;
        }
        while(left < right){
            int mid = left + (right-left)/2;    
            if(check(weights,mid,days)) right=mid;
            else left =mid+1;
        }
        return left;
    }
}