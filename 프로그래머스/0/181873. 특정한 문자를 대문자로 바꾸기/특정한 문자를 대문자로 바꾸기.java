class Solution {
    public String solution(String my_string, String alp) {
        // my_string.replace(alp.charAt(0), Character.toUpperCase(alp.charAt(0))); 해도 된다. 
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (alp.equals(String.valueOf(my_string.charAt(i)))) {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else {
                 answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}