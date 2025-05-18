import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        // for 문이라 성능좋게  StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        // answer += "" + my_string.charAt(index_list[i]);
        }
        return sb.toString();
    }
}