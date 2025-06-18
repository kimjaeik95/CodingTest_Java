import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> tmp = new ArrayList<>();
    
        for (int i = 0; i < arr.length; i++) {
            // 반복문이 다시 시작하면 true 돌아가야하니 for문안으로 boolean 설정
            boolean canArr = true; 
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    canArr = false;
                    break; // 중복 수가 없기 때문에 break 사용가능
                }
            }
            
            if (canArr) {
                tmp.add(arr[i]);
            }
        }
        
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}