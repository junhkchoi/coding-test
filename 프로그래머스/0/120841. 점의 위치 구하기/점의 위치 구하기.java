class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int multi = dot[0] * dot[1];
        answer = (multi > 0) ? ((dot[0] > 0) ? 1 : 3) : ((dot[0] > 0) ? 4 : 2);
        return answer;
    }
}