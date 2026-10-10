class Solution {
    public int solution(int[] num_list) {
        int sumOfList = 0, multiOfList = 1;
        
        for (int n : num_list) {
            sumOfList += n;
            multiOfList *= n;
        }
        int answer = (multiOfList > sumOfList * sumOfList) ? 0 : 1;
        
        return answer;
    }
}