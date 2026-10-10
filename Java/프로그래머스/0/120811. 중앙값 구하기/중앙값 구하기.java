class Solution {
    public int solution(int[] array) {
        // 정렬을 일일히 구현했는데 이거말고 Array.sort() 메서드가 있는거 같음 알아봐야겠노
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[array.length / 2];
    }
}