import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        // while문으로 간단하게 반복할 수 있지만 l++ 추가줘야 함
        for(int num = l; num <= r; num++) {
            String tmp = String.valueOf(num);
            boolean valid = true;
            
            for(char c : tmp.toCharArray()) {
                if(c != '5' && c != '0') {
                    valid = false;
                    break;
                }
            }
                
            if(valid) {
               list.add(num);
            } 
        }
        
        // 이 부분이 어려웠따.. 비어있는거 확인하면 -1 넣기
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }
        
        // 스트림으로도 간단하게 할 수 있지만 아직 모르기때문에 정석대로 for문으로 변환함
        // int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}