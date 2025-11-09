class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int[] arr=new int[n1+n2];

        System.arraycopy(nums1, 0, arr, 0, n1);
        System.arraycopy(nums2, 0, arr, n1, n2);
        Arrays.sort(arr);


        int n = arr.length;
        if(arr.length%2==0){
           return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }
        else{
            return arr[n/2];
        }
        
    }
}