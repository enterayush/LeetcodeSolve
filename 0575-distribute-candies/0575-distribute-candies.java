class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int eat = n/2;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        int types=set.size();
        return types>eat? eat:types;
    }
}