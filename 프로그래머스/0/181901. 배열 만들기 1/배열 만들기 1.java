class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        // answer 인덱스 올리기 변수
        int a = 0;
        for (int i = k; i <= n; i += k) {
            answer[a] = i;
            a++;
        }
        
        return answer;
    }
}