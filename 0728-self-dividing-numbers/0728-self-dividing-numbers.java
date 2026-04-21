class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) { 
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp=i , d;
            while(temp > 0) {
                d=temp%10;
                if(d==0 || i % d != 0){
                    break;
                }
                temp /= 10;
            }
            if(temp == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}