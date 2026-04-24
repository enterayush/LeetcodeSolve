class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if(s.length()==0) return 0;
        long result = 0;
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-') {
            sign = -1;
            i++;
        }
        else if(s.charAt(i)=='+') i++;
        
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i)-'0');
            if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(result*sign);
    }
}