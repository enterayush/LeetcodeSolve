class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        int dig = 0;
        while(n != 0){
            dig = n%10;
            arr[dig]++;
            n = n/10;
        }
        int sum =0;
        for (int i = 0; i < 10; i++) {
            sum += i * arr[i];
        }
        return sum;
    }
}



