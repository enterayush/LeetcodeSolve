class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        int dig =0;
        while(temp != 0){
            dig = temp %10;
            temp = temp/10;
            sum += dig;
            prod *= dig;
        }
        int total = sum + prod;
        if(n % total == 0) return true;
        return false;
    }
}