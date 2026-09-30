class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int last = phone_number.length();
        for (int i = 0; i < last - 4; i++) {
            answer += "*";
        }
        for (int i = last - 4; i < last; i++) {
            answer += phone_number.charAt(i);
        }
        return answer;
            
            // 012345678 -> 총 자릿수(9)에서 4를 뺀 인덱스에서 시작
            // 0123456789 10
            
    }
}