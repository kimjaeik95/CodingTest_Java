import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        /*int totalLength = 0;
         for (int i = 0; i < arr.length; i++) {
             totalLength += arr[i]; 인덱스 값을 더해서  
         int[] answer = new int[totalLength]; answer길이를 구한다.
         하지만 나는 동적배열을 사용해봤다. 하지만 반환은 int[] 이기 때문에
         result[] 따로 고정길이 변환을 했다.
         하지만 한번의 더 변환으로 for문이 추가되고 Integer에서 int비용이 든다.
        */
        ArrayList<Integer> answer = new ArrayList<>();
        int a = 0;
        
        for(int i = 0; i < arr.length; i++) {
            a = arr[i];
            for(int j = 0; j< a; j++) {
                answer.add(a);
            }
        }
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
    }
        return result;
    }
}