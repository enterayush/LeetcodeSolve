class Solution {
    boolean divSum(int[] nums, int threshold, int mid) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + mid - 1) / mid;
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (divSum(nums, threshold, mid))
                right = mid;
            else
                left = mid + 1;
        }
        return right;
    }
}