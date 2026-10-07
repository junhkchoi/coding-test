class Solution {
    public int solution(int[] sides) {
        int longSide = sides[0];
        int otherSides = 0;
        for (int s : sides) {
            if (s > longSide) {
                longSide = s;
            } else {
                otherSides += s;
            }
        }
        int answer = otherSides > longSide ? 1: 2;
        
        return answer;
    }
}