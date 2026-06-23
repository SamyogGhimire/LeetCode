class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer, Integer> map =new HashMap<>();
        map.put(0,-1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                nums[i] = -1;
            } else {
                nums[i] = 1;
            }
        }
        int count  =0;
        int maxl=0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        
            
            if (map.containsKey(sum)){
                count = i - map.get(sum);
                maxl = Math.max(maxl,count);
            }
            else{
            map.put(sum,i);
            }
    
    }
    return maxl;
}
}