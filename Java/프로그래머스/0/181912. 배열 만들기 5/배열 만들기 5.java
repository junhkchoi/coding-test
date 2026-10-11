class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int idxCnt = 0;
        
        for (String str : intStrs) {
            int num = 0;
            str = str.substring(s, s + l);
            for (int i = 0; i < str.length(); i++) {
                num = 10 * num + (str.charAt(i) - '0');
            }
            if (num > k) {
                idxCnt++;
            }
        }
        
        int[] answer = new int[idxCnt];
        int idx = 0;
        for (String str : intStrs) {
            int num = 0;
            str = str.substring(s, s + l);
            for (int i = 0; i < str.length(); i++) {
                num = 10 * num + (str.charAt(i) - '0');
            }
            if (num > k) {
                answer[idx] = num;
                idx++;
            }
        }
        return answer;
    }
}