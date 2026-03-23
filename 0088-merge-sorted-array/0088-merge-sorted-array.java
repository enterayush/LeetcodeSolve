class Solution {
    void swapIfGreater(int[] nums1,int[] nums2, int i,int j){
        if(nums1[i]>nums2[j]){
            int temp = nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int gap =(int) Math.ceil((len)/2.0);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                //arr1 and arr2
                if(left<m && right>=m){
                    swapIfGreater(nums1, nums2,left,right-m);
                }
                //arr2 and arr2
                else if(left>=m){
                    swapIfGreater(nums2, nums2,left-m,right-m);
                }
                //arr1 and arr1
                else{
                    swapIfGreater(nums1, nums1,left,right);
                }
                right++;
                left++;
            }
            if(gap==1) break;
            gap = (int) Math.ceil(gap/2.0);
        }
        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
    }
}