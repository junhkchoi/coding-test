class Solution {
    public int[] solution(int n) {
        int idxCnt = 1;
        int x = n;
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            idxCnt++;
        }
        int[] answer = new int[idxCnt];
        answer[0] = x;
        int idx = 1;
        
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
                answer[idx] = x;
            } else {
                x = 3 * x + 1;
                answer[idx] = x;
            }
            idx++;
        }
        
        
        return answer;
    }
}