class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int totalProduct = 1;  // 곱은 0으로하면 계속 0나오기때문에 1로 해야함
        
        for(int a : num_list) {
            sum += a;
            totalProduct *= a;
        }
        
        int sumSquare = sum * sum;
        
        if (totalProduct < sumSquare) {
            return 1;
        }
        
        // totalProduct < sumSquare ? 1: 0;
        return 0;
    }
}