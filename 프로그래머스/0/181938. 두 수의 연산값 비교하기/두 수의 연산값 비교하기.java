class Solution {
    public int solution(int a, int b) {
       int answer = 0;
        // 자바가 자동적으로 new StringBuilder().append("") 추가 null이면 null 추가됨
        // String.valueOf(a) + String.valueOf(b) null세이프
       String ab = "" + a + b;
        // Integer.valueOf(ab); // 리턴: Integer parseInt 리턴 : int 정수
       if (Integer.parseInt(ab) == 2 * a * b){
            return answer =Integer.parseInt(ab);
        } else if (Integer.parseInt(ab) < 2 * a * b) {
            return answer = 2 * a * b;
        } else if (Integer.parseInt(ab) > 2 * a * b) {
            return answer = Integer.parseInt(ab);
        }
        return answer;
    }
}