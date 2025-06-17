class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c < 'l')  { // 아스키코드 108
                sb.append('l');
        } else {
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();
    }
}