class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int num: nums){
//             map.put(num, map.getOrDefault(num,0)+1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if (entry.getValue() > 1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }