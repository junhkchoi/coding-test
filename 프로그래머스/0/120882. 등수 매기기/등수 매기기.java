class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] ranking = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            answer[i] = (score[i][1] + score[i][0]);
        }
        // answer = [75, 70, 55, 65];
        for (int i = 0; i < answer.length; i++) {
            int rank = 1;
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] < answer[j]) {
                    rank++;
                }
            }
            ranking[i] = rank;
        }
        
        return ranking;
    }
}