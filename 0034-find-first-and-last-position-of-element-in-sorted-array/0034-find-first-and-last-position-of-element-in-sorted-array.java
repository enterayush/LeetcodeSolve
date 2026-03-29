class Solution {
    public int lowerBound(int[] arr, int x) {
        // Lower bound
        int ans = arr.length;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= x) {
                ans=mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public int upperBound(int[] arr, int x) {
        // Upper Bound
        int ans = arr.length;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > x) {
                ans=mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb =lowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }
        int up = upperBound(nums,target)-1;
        return new int[]{lb, up};

    }
}