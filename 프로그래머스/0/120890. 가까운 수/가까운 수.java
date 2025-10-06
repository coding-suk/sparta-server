import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
         for(int i=1; i<array.length; i++) {
             if(Math.abs(array[0] - n) > Math.abs(array[i] - n)) {
                 array[0] = array[i];
             }
         }
        
        return answer = array[0];
    }
}