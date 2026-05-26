class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSmal=0;
        int sumDoub=0;
        for(int i:nums){
            if(i<10)sumSmal+=i;
            else sumDoub+=i;
        }
        return sumDoub>sumSmal || sumDoub<sumSmal;
    }
}