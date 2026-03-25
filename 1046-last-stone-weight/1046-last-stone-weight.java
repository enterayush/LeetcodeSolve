class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        for(int i =0;i<n;i++){
            maxHeap.add(stones[i]);
        }
        while(maxHeap.size()>1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(y != x){
                maxHeap.add(y-x);
            }

        }
        return maxHeap.isEmpty() ?0:maxHeap.peek();
    }
}