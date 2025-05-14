import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // 접미사란 끝에서부터 점차적으로 한글자씩 자름 banana anana 
        // 접두사는 반대로 앞에서부터잘라서 잘라 점차적으로 늘린다. a ana 
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }
        // 사전순 정렬 sort 
        Arrays.sort(answer);
        return answer;
    }
}