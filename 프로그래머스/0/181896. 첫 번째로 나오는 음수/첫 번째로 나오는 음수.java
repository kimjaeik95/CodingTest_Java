class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                // 인덱스 위치 반환
                answer = i;
                // 멈춰야함으로 break
                break;
            }
            answer = -1;
        }
        return answer;
    }
}