import java.util.*;

public class Solution {
    public int solution(int n) {
        String answer = n + "";
        int result = 0;
        for (int i = 0; i < answer.length(); i++) {
            result += answer.charAt(i) - '0';
        }

        return result;
    }
}