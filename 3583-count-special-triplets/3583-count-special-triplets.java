class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        long mod = 1000000007;

        // Right-side frequency map
        Map<Integer, Integer> right = new HashMap<>();
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> left = new HashMap<>();
        long ans = 0;

        // Check every index j as middle
        for (int j = 0; j < n; j++) {
            int x = nums[j];
            right.put(x, right.get(x) - 1); // remove j from right

            int need = x * 2;

            long leftCount = left.getOrDefault(need, 0);
            long rightCount = right.getOrDefault(need, 0);

            ans = (ans + (leftCount * rightCount) % mod) % mod;

            left.put(x, left.getOrDefault(x, 0) + 1);
        }

        return (int) ans;
    }
}
