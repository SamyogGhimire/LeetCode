class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int n = s.length();

        if (s.equals(goal)) {
            return true;
        }
            

        for (int k = 1; k < n; k++) {
            char[] arr = s.toCharArray();

            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);

            if (new String(arr).equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}