import java.util.*;
class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        // String.join("" + arr); 으로도 가능함
        // StringBuilder 통해 가변으로 이어붙혀서 마지막만 불변객체로 변환
        return answer.toString();
    }
}