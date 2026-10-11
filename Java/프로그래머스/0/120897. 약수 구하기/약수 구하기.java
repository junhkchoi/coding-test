class Solution {
    public int[] solution(int n) {
        int idxCnt = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) idxCnt++;
        }
        int[] answer = new int[idxCnt];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[idx] = i;
            idx++;
            } 
                
        }
        return answer;
    }
}