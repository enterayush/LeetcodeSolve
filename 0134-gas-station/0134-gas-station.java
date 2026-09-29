class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal=0;
        int costTotal =0;
        for(int i =0;i<gas.length;i++){
            gasTotal+= gas[i];
            costTotal += cost[i];
        }
        if(costTotal>gasTotal) return -1;
        int start=0;
        int extra =0;
        for(int i =0;i<gas.length;i++){
            int check = gas[i]-cost[i];
            extra += check;
            if(extra<0){
                extra=0;
                start=i+1;
            }
        }
        return start;
    }
}