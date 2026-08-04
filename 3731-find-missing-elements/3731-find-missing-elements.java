class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        boolean[] contain = new boolean[101];
        List<Integer> res = new ArrayList<>();
        for(int i :nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
            contain[i] = true;
        }
        for(int i = min;i<=max;i++){
            if(!contain[i]) res.add(i);
        }
        return res;
    }
}