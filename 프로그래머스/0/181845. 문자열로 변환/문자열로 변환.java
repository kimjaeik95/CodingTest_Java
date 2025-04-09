class Solution {
    public String solution(int n) {
        String answer = "";
        // valueOf 내부에는 Integer.toString() 이 있음
        // valueOf 는 여러타입을 받을 수 있다.
        answer = String.valueOf(n);
        return answer;
    }
}