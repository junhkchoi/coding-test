class Solution {
    public int[] solution(int n) {
        int[] answer = (n % 2 == 0) ? new int[n / 2] : new int[n / 2 + 1];
        int maxN = n;
        if (maxN % 2 == 0) {
            n -= 1;
            for (int i = answer.length - 1; i >= 0; i--) {
                answer[i] = n;
                n -= 2;
            }
        } else {
            for (int i = answer.length - 1; i >= 0; i--) {
                answer[i] = n;
                n -= 2;
            }
        }
        return answer;
    }
}
// (15 / 2) + 1 = 8
// (10 / 2) = 5