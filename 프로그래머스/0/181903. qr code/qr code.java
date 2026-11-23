class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int idx = 0;
        
        while (idx < code.length()) {
            if (idx % q == r) {
                answer += code.charAt(idx);
            }
            idx++;
        }
        return answer;
    }
}