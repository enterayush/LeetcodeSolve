class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int p=0,q=0;
        int[] pos =new int[n/2];
        int[] neg =new int[n/2];
        int[] fin =new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }else{
                neg[q]=nums[i];
                q++;
            }
        }
        for(int i =0;i<n/2;i++){
            fin[2*i]=pos[i];
            fin[2*i+1]=neg[i];
        }
        return fin;
    }
}