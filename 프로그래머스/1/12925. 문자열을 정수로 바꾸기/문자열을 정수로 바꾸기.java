class Solution {
    public int solution(String s) {
        int answer = 0;
        int start = 0;
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (s.charAt(0) == '+') {
            start = 1;
        }

        for (int i = start; i < s.length(); i++) {
            answer = answer * 10 + (s.charAt(i) - '0');
        }

        return answer * sign;
    }
}
