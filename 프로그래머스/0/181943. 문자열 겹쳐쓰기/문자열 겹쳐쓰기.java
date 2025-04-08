class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        /* str.substring(startIndex, endIndex)  endIndex 인덱스포함 X
           my_string.subString(s + overwrite_string.length) startIndex 인덱스만
        */
        answer = my_string.substring(0, s) + overwrite_string
            + my_string.substring(s + overwrite_string.length());
            
        return answer;
    }
}