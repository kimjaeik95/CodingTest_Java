class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int b = Integer.parseInt(parts[2]);
        if (operation.equals("+")) {
            answer = a + b;
        } else if (operation.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }
}