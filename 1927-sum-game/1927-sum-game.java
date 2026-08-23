class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double res  = 0;
        for(int i =0;i<n;i++){
            int sign = (i< n/2) ? 1:-1;
            double value;
            if(num.charAt(i) == '?') value = 4.5;
            else value = num.charAt(i)-'0';
            res += sign * value;
        }
        return res != 0;

    }
}