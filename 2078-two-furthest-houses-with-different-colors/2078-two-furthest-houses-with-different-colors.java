class Solution {
    public int maxDistance(int[] colors) {
        int left = 0;
        int right = colors.length - 1;
        int maxAns = 0;

        while (left < right){
            if (colors[left] != colors[right]){
                maxAns = Math.max(maxAns, right - left);
            }
            right --;

        }
        right = colors.length-1;

        while (left<right){
              if (colors[left] != colors[right]){
                maxAns = Math.max(maxAns, right - left);
            }
            left ++;

        }
        return maxAns;
    }
}