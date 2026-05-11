class Solution {
    long MOD = 1000000007;
    public long power(long x, long n){
        if(n == 0) return 1;
        long half = power(x,n/2);
        long ans = (half * half) % MOD;
        if(n%2==1) ans = (ans*x) % MOD;
        return ans;
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int)ans;
    }
}