class Solution {
    public String solution(int age) {
        String answer = ""; // a = 97
        
        while (age > 0) {
            char alpha = (char) (age % 10 + 97);
            answer = alpha + answer;
            age /= 10;
        }
        return answer;
    }
}