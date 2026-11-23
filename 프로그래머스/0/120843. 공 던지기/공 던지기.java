class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        
        for (int i = 1; i < k; i++) {
            answer += 2;
            if (answer > numbers[numbers.length - 1]) answer %= numbers[numbers.length - 1];
        }
        
        return answer;
    }
}