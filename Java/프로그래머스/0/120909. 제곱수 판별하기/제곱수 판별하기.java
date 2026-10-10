class Solution {
    public int solution(int n) {
        int checkTower = 1;
        while (checkTower <= n) {
            int tower = checkTower * checkTower;
            if (n == tower) {
                return 1;
            } else {
                checkTower++;
            }
        }
        return 2;
    }
}