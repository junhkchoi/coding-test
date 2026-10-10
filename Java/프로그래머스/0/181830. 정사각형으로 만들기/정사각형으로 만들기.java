class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr[0].length, height = arr.length;
        int[][] answer = (width >= height) ? new int[width][width] : new int[height][height];        
        
        if (width < height) { // case 1 각 행의 끝에 0 추가
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
            
        } else if (width > height) { // case 2 각 열의 끝에 0을 추가
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
            return answer;
        } 
        return arr;
    }
}