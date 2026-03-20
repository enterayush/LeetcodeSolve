class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;
                int mid = j + 1;
                int right = n - 1;
                while (mid < right) {
                    long sum = (long)nums[i] + nums[j] + nums[mid] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[mid], nums[right]));
                        mid++;
                        right--;
                        while (mid < right && nums[mid] == nums[mid - 1])
                            mid++;
                        while (mid < right && nums[right] == nums[right + 1])
                            right--;

                    } else if (sum < target) {
                        mid++;

                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}