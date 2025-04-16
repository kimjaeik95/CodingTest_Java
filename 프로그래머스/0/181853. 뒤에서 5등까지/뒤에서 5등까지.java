import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        // 멀티스레드 병렬 큰 배열에 사용해야함
        // Arrays.parallelSort(num_list);
        Arrays.sort(num_list);
        answer = Arrays.copyOf(num_list, 5);
        return answer;
    }
}