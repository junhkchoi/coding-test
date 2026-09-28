class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            } else {
                continue;
            }
        }
        return answer;
        
        /* 
        int[] numbers = new int[3000];
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numbers[i] = i;
            } else {
                numbers[i] = 0;
            }
        }
        
        for (int num : numbers) {
           answer += num; 
        }
        return answer;
        */
    }
}