class Solution { 
    int signFunc(long p){ 
        if(p<0) return -1; 
        else if(p>0) return 1; 
        else return 0; 
    } 
    public int arraySign(int[] nums) { 
        long sign = 1; 
        for(int i : nums){ 
            if(i == 0) return signFunc(0); 
            if(i < 0){
                sign = -sign;
            } 
        }
        return signFunc(sign);
    } 
}
