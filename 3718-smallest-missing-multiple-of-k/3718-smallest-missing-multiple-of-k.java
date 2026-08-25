class Solution {
    public int missingMultiple(int[] nums, int k) {
        int smallest = k;
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums){
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++){
            if (!set.contains(smallest)){
                return smallest;
            }
             smallest = smallest + k;

             if (i == nums.length){
                return k * nums.length + 1;
             }
        }
        return -1;
    }
}