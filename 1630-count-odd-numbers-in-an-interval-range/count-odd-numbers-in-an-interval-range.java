class Solution {
    public int countOdds(int low, int high) {
        int total = high - low + 1;
        int count = total/2;
        if (low%2!=0 && high%2!=0){
            count++; 
        }
        return count;
    }
}