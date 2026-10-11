class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int startIdx = my_string.length() - n;
        for (int i = startIdx; i < my_string.length(); i++) {
            answer += my_string.charAt(i) + "";
            // substring이라는 문자열의 부분을 추출하는 메서드가 있는 거 같음 알아보자
        }
        return answer;
    }
}