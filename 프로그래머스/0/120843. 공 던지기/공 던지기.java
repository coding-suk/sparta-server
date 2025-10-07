class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int answer = 0;
        int idx = 0;
        int cnt = 1;
        
        while(true) {
            if(cnt == k) {
                answer = numbers[idx];
                break;
            }
            idx += 2;
                
            if(idx > len-1) {
                idx = idx-len;
            }
            cnt++;
        }
        
        
        
        return answer;
    }
}