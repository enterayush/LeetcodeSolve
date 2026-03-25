class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = nums.length;
        int j =0;
        int length=0;
        for(int i =0;i<n;i++){
            minHeap.offer(new int[]{nums[i],i});
            maxHeap.offer(new int[]{nums[i],i});

            while(!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek()[0]-minHeap.peek()[0]>limit){
                j++;
                while(!minHeap.isEmpty() && minHeap.peek()[1]<j){
                    minHeap.poll();
                }
                while(!maxHeap.isEmpty() && maxHeap.peek()[1]<j){
                    maxHeap.poll();
                }
            }
            length = Math.max(length,i-j+1);
        }
        return length;
    }
}