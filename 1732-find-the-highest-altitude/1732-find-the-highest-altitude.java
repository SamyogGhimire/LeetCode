class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int j = 1;
        for (int i = 0 ; i < gain.length; i++){
            altitude[j] = altitude[i] + gain[i];
            j++;
        }

        int maxAltitude = 0;
        for (int num: altitude){
            maxAltitude = Math.max(maxAltitude, num);
        }
        return maxAltitude;
    }
}