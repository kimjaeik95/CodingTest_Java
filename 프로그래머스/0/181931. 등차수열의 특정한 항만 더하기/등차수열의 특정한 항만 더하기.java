class Solution {
    public int solution(int a, int d, boolean[] included) {
        // ₙ = a + (n - 1) × d 등차수열 공식이지만
        //수학에서 n은 1부터 시작하기 때문에 (n - 1)이 필요해요.
        //하지만 코드에서는 i 자체가 이미 (n - 1)과 같은 역할을 하고 있어요.
        // 공차 + 등차수열이 계속 늘어나면서 곱해진다.
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a + i * d;
            }
        }
     
        return answer;
    }
}