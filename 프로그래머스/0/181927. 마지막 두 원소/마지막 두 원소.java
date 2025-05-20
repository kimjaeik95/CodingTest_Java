class Solution {
    public int[] solution(int[] num_list) {
        // 배열크기 지정과  인덱스의 값을 잘 생각해야한다. 배열크기보다  인덱스 값은 -1
        int[] answer = new int[num_list.length + 1];
        int last = num_list[num_list.length -1];
        int lastBefore = num_list[num_list.length - 2];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (last > lastBefore) {
            answer[num_list.length] = last - lastBefore;
        } else {
            answer[num_list.length] = last * 2;
        }
        return answer;
    }
}
 