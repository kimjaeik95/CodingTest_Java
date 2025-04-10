import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        
         // num_list를 오름차순으로 정렬합니다.
        Arrays.sort(num_list);
        
        // 정렬된 배열을 인덱스 5부터 , num_list 길이까지
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        return answer;
   }
}