class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList 로 동적으로 하면 간단히 풀렸지만 반환값까지 바꿔야함으로 사용 X
        // 배열 크기 계산
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];
        // answer 순차적 인덱스용
        int idx = 0;
        
        for (int i = 0; i < num_list.length; i += n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}