class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int n1 = nums1.length;
        int n2 = nums2.length;
        double ans = 0;

        int i = 0, j = 0, k=0;

        while (i < n1 && j < n2){
            if (nums1[i] <= nums2[j]){
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n1){
            merged[k++] = nums1[i++];
        }
        while(j < n2){
            merged[k++] = nums2[j++];
        }

        if (merged.length % 2 == 0){
            int mid1 = merged.length / 2 - 1;
            int mid2 = merged.length / 2;
            ans = (merged[mid1] + merged[mid2]) / 2.0;
        } else {
            int mid1 = merged.length / 2;
            ans = merged[mid1];
        }
        return ans;
        
    }
}