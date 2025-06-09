import java.lang.Math;
class Solution {
    public int solution(int a, int b, int c) {
        // answer = (a + b + c ) * ((int) Math.pow(a,2)  + (int) Math.pow(b,2) + (int) Math.pow(c,2));   Math.pow 함수로 3제곱까지 해줄 수 있다.
        int answer = 0;
        if (a != b && a != c && b!=c) {
            answer = a + b + c;
        } else if (a == b && a != c || a == c && b != c || b == c && a != b) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (a == b && b == c) {
            answer = (a + b + c) * (a * a  + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        return answer;
    }
}