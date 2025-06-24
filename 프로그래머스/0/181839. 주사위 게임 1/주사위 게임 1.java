class Solution {
    public int solution(int a, int b) {
        int answer = 0;
         if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);  // -(a-b) 해도 됨 음수를 붙히면 정수가 됨
        }
        return answer;
    }
}