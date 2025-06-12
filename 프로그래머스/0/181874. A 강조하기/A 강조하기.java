class Solution {
    public String solution(String myString) {
        myString = myString.replace("a", "A");
        StringBuilder answer = new StringBuilder();
        for (char c : myString.toCharArray()) {
            // replace로 A를 먼저 변경했으니 A를 가려내야함
            if (Character.isUpperCase(c) && c != 'A') {
                // A가 아닌 대문자는 소문자로 변경
                answer.append(Character.toLowerCase(c));
            } else {
                // 애초에 소문자는 그대로 넣어야함
                answer.append(c);
            }
        }
        return answer.toString();
    }
}