class Solution {
    int answerIdx;
    int idx;
    public int[] solution(int[] arr) {
        for (int num : arr) {
            answerIdx += num;
        }
        
        int[] answer = new int[answerIdx];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}