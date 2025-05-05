import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
            answer.add(todo_list[i]);
            }
        }
        //String[] 타입으로 안전하게 배열을 만들기 위해 필요하다.
        //new String[0]이 "빈 배열"이지만, 
        //자바는 그걸 보고 자동으로 필요한 크기의 배열을 새로 만들어 반환해 줘.
        return answer.toArray(new String[0]);
    }
}