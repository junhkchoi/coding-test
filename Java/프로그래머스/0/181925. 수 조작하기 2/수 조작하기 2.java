class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length - 1; i++) {
            int checkLog = numLog[i + 1] - numLog[i];
            String log = switch(checkLog) {
                    case 1 -> "w";
                    case -1 -> "s";
                    case 10 -> "d";
                    case -10 -> "a";
                    default -> "";
            };
            answer += log;
        }
        return answer;
    }
}