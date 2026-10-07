class Solution {
    public int[] solution(int n, int[] numlist) {
        int idxCnt = 0;
        int Cnt = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                idxCnt++;
            }
        }
        int[] answer = new int[idxCnt];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[Cnt] = numlist[i];
                Cnt++;
            } else {
                continue;
            }
        }
        
        return answer;
    }
}