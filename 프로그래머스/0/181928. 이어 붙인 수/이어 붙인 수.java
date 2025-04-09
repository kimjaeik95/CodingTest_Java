import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String stringAnswer = "";
        String stringAnswer2 = "";
        for (int i =0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                stringAnswer += String.valueOf(num_list[i]);
            } else {
                stringAnswer2 += String.valueOf(num_list[i]);
            }
        }
        return answer = Integer.valueOf(stringAnswer) 
                      +  Integer.valueOf(stringAnswer2);
    }
}