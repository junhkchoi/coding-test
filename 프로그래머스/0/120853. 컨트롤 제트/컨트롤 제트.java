class Solution {
    public int solution(String s) {
        int answer = 0;
        int before = 0;

        String[] ss = s.split(" ");

        for (String num : ss) {
            if (num.equals("Z")) {
                answer -= before;
            } else {
                before = Integer.parseInt(num);
                answer += before;
            }
        }

        return answer;
    }
}