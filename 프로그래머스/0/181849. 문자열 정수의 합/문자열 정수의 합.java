class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        //parseInt랑 split이 자주보이는데 알아보자
        
        for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        return answer;
    }
}