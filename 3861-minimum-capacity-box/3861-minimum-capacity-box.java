class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int mini = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (itemSize <= capacity[i] && capacity[i] < mini) {
                mini = capacity[i];
                index = i;
            }
        }
        return index;
    }
}