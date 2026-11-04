class Solution {

    TreeMap<Integer, Integer> left = new TreeMap<>();
    TreeMap<Integer, Integer> right = new TreeMap<>();

    long sumLeft = 0;
    long sumRight = 0;

    int leftSize = 0;
    int rightSize = 0;

    void addLeft(int val) {
        left.put(val, left.getOrDefault(val, 0) + 1);
        sumLeft += val;
        leftSize++;
    }

    void addRight(int val) {
        right.put(val, right.getOrDefault(val, 0) + 1);
        sumRight += val;
        rightSize++;
    }

    void removeLeft(int val) {
        int count = left.get(val);

        if (count == 1) {
            left.remove(val);
        } else {
            left.put(val, count - 1);
        }

        sumLeft -= val;
        leftSize--;
    }

    void removeRight(int val) {
        int count = right.get(val);

        if (count == 1) {
            right.remove(val);
        } else {
            right.put(val, count - 1);
        }

        sumRight -= val;
        rightSize--;
    }

    // Balance according to current window size
    void rebalance() {

        int total = leftSize + rightSize;
        int target = (total + 1) / 2;

        while (leftSize > target) {
            int val = left.lastKey();

            removeLeft(val);
            addRight(val);
        }

        while (leftSize < target) {
            int val = right.firstKey();

            removeRight(val);
            addLeft(val);
        }
    }

    void insert(int val) {

        if (left.isEmpty() || val <= left.lastKey()) {
            addLeft(val);
        } else {
            addRight(val);
        }

        rebalance();
    }

    void erase(int val) {

        if (left.containsKey(val)) {
            removeLeft(val);
        } else {
            removeRight(val);
        }

        rebalance();
    }

    long getCost() {

        long median = left.lastKey();

        return median * leftSize - sumLeft
             + sumRight - median * rightSize;
    }

    public long minOperations(int[] nums, int x, int k) {

        // Reset state
        left.clear();
        right.clear();

        sumLeft = 0;
        sumRight = 0;

        leftSize = 0;
        rightSize = 0;

        int n = nums.length;
        int m = n - x + 1;

        long[] cost = new long[m];

        //  First window
        for (int i = 0; i < x; i++) {
            insert(nums[i]);
        }

        cost[0] = getCost();

        //  Sliding window
        for (int i = 1; i < m; i++) {

            erase(nums[i - 1]);

            insert(nums[i + x - 1]);

            cost[i] = getCost();
        }

        //  DP
        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 1; j <= k; j++) {

                // Skip current index
                long skip = dp[i + 1][j];

                // Take window starting at i
                long take = INF;

                if (i + x <= n) {
                    take = cost[i] + dp[i + x][j - 1];
                }

                dp[i][j] = Math.min(skip, take);
            }
        }

        return dp[0][k];
    }
}