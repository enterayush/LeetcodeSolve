class Solution {
    public int minimumOperations(int[] nums) {
        int operation=0;
        for(int i:nums){
            if(i%3==1){
                operation+=1;
            }
            else if(i%3==2){
                operation+=1;
            }
        }
        return operation;
    }
}