class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int cnt = 0;
        for (int i = num1; num1 <= num2; num1++) {
            answer[cnt] = numbers[num1];
            cnt++;
        }
        return answer; 
    }
}