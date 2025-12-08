class Solution {
    public int countTriples(int n) {
        int triplet = 0;
        for (int i= 1; i<=n;i++){
            for(int j=1 ;j<i;j++){

                int sum = i*i+j*j;
                int c = (int)Math.sqrt(sum);

                if(c*c==sum && c <= n){
                    triplet++;
                }
            }
        }
        return triplet*2;
        
    }
}