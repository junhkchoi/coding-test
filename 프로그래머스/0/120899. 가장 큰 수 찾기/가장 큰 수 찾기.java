class Solution {
    public int[] solution(int[] array) {
        int big = array[0];
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= big) {
                big = array[i];
                result[0] = big;
                result[1] = i;
            }
        }
        return result;
    }
}