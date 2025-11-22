import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I' ,1);
        romanMap.put('V' , 5);
        romanMap.put('X' , 10);
        romanMap.put('L' , 50);
        romanMap.put('C' , 100);
        romanMap.put('D' , 500);
        romanMap.put('M' , 1000);

        int sum = 0;
        char[] arr = s.toCharArray();

        for (int i=0;i<arr.length;i++){
            int value = romanMap.get(arr[i]);
            
            if (i+1<arr.length && romanMap.get(arr[i+1])>value){
                sum-=value;
            }else{
                sum+=value;
            }
            
        }
        return sum;
    }
}