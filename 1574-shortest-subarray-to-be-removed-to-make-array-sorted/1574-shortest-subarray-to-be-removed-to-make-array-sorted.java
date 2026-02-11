class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (right > 0 && arr[right] >= arr[right - 1]){
            right --;
        }

        int len = right;
        while (left < right && (left == 0 || arr[left] >= arr[left - 1])){
            while (right < arr.length && arr[left] > arr[right]){
                right ++;
            }
            len = Math.min(len, right - left - 1);
            left ++;
        }
        return len;
    }
}