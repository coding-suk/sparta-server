import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int c = 0;
        
        
        Arrays.sort(arr);
        for(int i=0; i<s.length(); i++) {
            c = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    c++;
                }
            }
            if(c == 1) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}