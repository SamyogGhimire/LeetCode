class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n-1;

        while (left <= right){
            int heights = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, heights * width);

            if (height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
            
        }
        return maxArea;
    }
}