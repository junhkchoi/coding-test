class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        return my_string.replaceAll(letter, "");
        
        // for (int i = 0; i < my_string.length(); i++) {
        //     if ((my_string.charAt(i) + "").equals(letter)) {
        //         continue;
        //     }
        //     answer += my_string.charAt(i);
        // }
        // return answer;
    }
}