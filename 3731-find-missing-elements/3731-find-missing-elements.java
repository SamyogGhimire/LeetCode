class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num: nums){
            minNum = Math.min(minNum,num);
            maxNum = Math.max(maxNum, num);
            set.add(num);
        }

        for (int i = minNum; i <= maxNum; i++){
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}