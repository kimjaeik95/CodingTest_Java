import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        // 전과 다르게 ArrayList로 결과를담고
        // String[] answer로 옮겨 담았다.
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}