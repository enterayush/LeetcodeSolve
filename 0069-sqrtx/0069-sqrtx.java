class Solution {
    public int mySqrt(int x) {
        if (x<2) return x;

        double n = x;
        while(Math.abs(n-x/n)>1e-7){
            n=(n+x/n)/2;
        }
        return (int) n;
    }
}


 