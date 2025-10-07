import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> num = new ArrayList<>();
        
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                num.add(i);
                while(n%i==0) {
                    n/=i;
                    
                }
            }
        }
        if(n>1) {
                num.add(n);
            }
        
        int[] answer = new int[num.size()];
        for(int i=0; i<num.size(); i++) {
            answer[i] = num.get(i);
        }
        
        
        
        return answer;
    }
}