class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        // a b c d e / code = 2 -> b d
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
            
        return answer;
    }
}