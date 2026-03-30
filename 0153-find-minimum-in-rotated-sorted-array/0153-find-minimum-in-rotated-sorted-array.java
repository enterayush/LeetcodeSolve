class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int left=0;
        int right = n-1;
        int ans=1;
        if (arr[left] <= arr[right]) {
            return arr[left];
        }
        while(left<right){
            int mid= left+(right-left)/2;
            if(arr[left]<=arr[mid]){
                if(arr[mid]>arr[mid+1]){
                    ans=arr[mid+1];
                    return ans;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(arr[mid]<arr[mid-1]){
                ans=arr[mid];
                return ans; 
                }
                else{
                    right=mid-1;
                }
            }
        }
        return ans;
    }
}