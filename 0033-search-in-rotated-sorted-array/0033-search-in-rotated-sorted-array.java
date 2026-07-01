// class Solution {
//     public int search(int[] nums, int target) {

//         int left = 0;
//         int right = nums.length - 1;

        
//         while (left < right){
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) return mid;
//             else if (nums[right] == target) return right;
//             else if (nums[left] == target) return left;

//             if (left > target && target < mid){
//                 left = mid + 1;
//             } else if (right < target && target > mid){
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getKey() == target){
                return entry.getValue();
            }
        }
        return -1;
    }
}