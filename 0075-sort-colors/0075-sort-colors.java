class Solution {  //Dutch National Flag
    public void sortColors(int[] nums) {
        int low =0;
        int mid=0;
        int high= nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }

            else if(nums[mid]==1){
                mid++;
            }

            else //nums[mid]==2
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                
            }
        }

    }
}