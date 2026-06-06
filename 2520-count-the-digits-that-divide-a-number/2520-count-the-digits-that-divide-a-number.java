class Solution {
    public int countDigits(int num) {
        int val =0;
        int nums =num;
        int cnt=0;
        while(num>0){
            val=(num%10);
            if(val != 0 && nums%val==0) cnt++;
            num/=10;
        }
        return cnt;
    }
}