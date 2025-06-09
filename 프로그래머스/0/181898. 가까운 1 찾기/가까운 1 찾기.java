class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        // 문제가 약간 이상한거같다 . idx 보다 커야하면  i = idx + 1 해야하지만
        // 예제3은 idx 인덱스 수가 마지막 1이라  i = idx 해야했다.
        for (int i = idx; i < arr.length; i++) { 
            if (arr[i] == 1) {
                 return answer = i;
            }
        }  
         return answer = -1;
    }
}