class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        // num % n == 0 ? 1 : 0 삼항연산자
        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}