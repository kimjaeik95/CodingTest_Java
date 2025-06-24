class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            // 문제에서는 첫 번째 원소를 1번이라고 지정해줬기때문에  인덱스 0 + 1
            if ((i + 1) % 2 != 0) {  
                a += num_list[i];
            } else {
                b += num_list[i];
            }
        }
    
        return a > b ? a : b;
    }
}