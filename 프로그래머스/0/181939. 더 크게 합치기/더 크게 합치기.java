import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = "";
        String str2 = "";
        
        str = String.valueOf(a);
        str2 = String.valueOf(b);
        int ab = Integer.parseInt(str + str2);
        int ba = Integer.parseInt(str2 + str);
        
        //if 문으로 하려다 삼항연산자 써봄
        answer = ab > ba ? ab : ba;
        
        return answer;
    }
}