class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1; //up=-1, down=1

        for (char c:s.toCharArray()){
            rows[row].append(c);
            row += direction;
        

        if (row == numRows - 1) {
            direction = -1; // go up
        } else if (row == 0) {
            direction = 1;  // go down
        }
    }
    // Step 4: combine all rows
    StringBuilder result = new StringBuilder();
    for (StringBuilder sb : rows) {
        result.append(sb);
    }

    return result.toString();

    }
}