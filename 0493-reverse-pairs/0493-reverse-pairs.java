class Solution {
    void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int k = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    int count(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right])
                right++;
            cnt += right - (mid + 1);
        }
        return cnt;
    }

    int ms(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += ms(arr, low, mid);
        cnt += ms(arr, mid + 1, high);
        cnt += count(arr, low, mid, high);
        merge(arr, low, mid, high);
        return cnt;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return ms(nums, 0, n - 1);

    }
}