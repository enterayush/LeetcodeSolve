class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 =0;
        int cnt2=0;
        int el1=0;
        int el2=0;
        for(int i =0;i<nums.length;i++){
            if(cnt1 ==0 && nums[i] != el2){
                el1 = nums[i];
                cnt1= 1;
            }
            else if(cnt2 ==0 && nums[i] != el1){
                el2 = nums[i];
                cnt2= 1;
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int n:nums){
            if(n==el1) cnt1++;
            else if(n==el2)cnt2++;
        }
        List<Integer> result = new ArrayList<>();
        if(cnt1 > nums.length / 3) result.add(el1);
        if(cnt2 > nums.length / 3) result.add(el2);
        return result;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> maj = new ArrayList<>();
        // int n = nums.length;
        // int freq = (n / 3) + 1;
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1); 
        //     if (map.get(num) == freq ) {    this freq dont let duplicate elements occur
        //         maj.add(num);
        //     }
        // }
        // return maj;
    }
}