class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int max = 0;
        int max2 = 0;
        
        // int max = Arrays.stream(arr1).sum(); 으로도 가능
        for (int k : arr1) {
            max += k;
        }
        for (int j : arr2) {
            max2 += j;
        }

        if (arr1.length > arr2.length) {
            answer = 1; 
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            if (max > max2) {
                answer = 1;
            } else if (max < max2) {
                answer = -1; 
            } else {
                answer = 0;
            }
        }

        return answer;
    }
}