
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        int[][] q = new int[queries.length][2];

        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        Arrays.sort(q, (a, b) -> a[0] - b[0]);

        int[] freq = new int[n + 1];
        int[] ans = new int[queries.length];

        int left = 0, right = 0;
        int activeCount = 0;

        for (int[] query : q) {

            int start = query[0] - x;
            int end = query[0];

            // Add logs with time <= end
            while (right < logs.length && logs[right][1] <= end) {
                int server = logs[right][0];

                if (freq[server] == 0) {
                    activeCount++;
                }

                freq[server]++;
                right++;
            }

            // Remove logs with time < start
            while (left < right && logs[left][1] < start) {
                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    activeCount--;
                }

                left++;
            }

            ans[query[1]] = n - activeCount;
        }

        return ans;
    }
}
