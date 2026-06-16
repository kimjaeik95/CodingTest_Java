import java.io.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
         for (int j = 0; j < my_string.length(); j += m) {
            int index = j + c - 1;
            sb.append(my_string.charAt(index));
        }
        
        return sb.toString();
    }
}