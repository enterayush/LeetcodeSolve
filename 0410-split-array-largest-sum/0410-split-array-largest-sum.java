class Solution {
    boolean minPage(int[] arr,int page,int k){
        int stu=1;
        int pagestu=0;
        for(int num:arr){
            if(pagestu+num <= page){
                pagestu += num;
            }else{
                stu++;
                pagestu=num;
            }
        }
        return stu<=k;
        
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int left = 0;
        int right = 0;
        int sum =0;
        
        for(int num:arr){
            sum+=num;
            left = Math.max(left,num);
            right = sum;
        }
        if(arr.length<k) return -1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(minPage(arr,mid,k)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}








