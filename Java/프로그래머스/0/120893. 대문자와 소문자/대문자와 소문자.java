class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer += Character.toLowerCase(my_string.charAt(i)) + "";
                // answer += (my_string.charAt(i)).toLowerCase() + ""; -> 틀린코드
                // toLowerCase()는 String 타입에 적용가능한 메서드이다.
                // char 타입엔 Character.toLowerCase(char 타입) 으로 해야함.
            } else if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer += Character.toUpperCase(my_string.charAt(i)) + "";
            }
        }
        return answer;
    }
}