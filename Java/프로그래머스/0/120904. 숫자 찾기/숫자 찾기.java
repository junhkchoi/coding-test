class Solution {
    public int solution(int num, int k) {
        String strNum = num + "";
        char strK = (char) (k + '0');
        
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == strK) {
                return i + 1; 
            }    
        }
        
        return -1;
    }
}