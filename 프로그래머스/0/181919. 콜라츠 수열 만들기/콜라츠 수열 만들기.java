import java.util.*;
class Solution {
    public int[] solution(int n) {
        /* 콜라츠 수열은 1의 도달하는게 몇개인지 모르기 때문에 동적 타입으로 바꿔야한다.
           지금 코드는 answer.add를 if문에 n의 값을 변경하고 while문이 시작할때 
           값을 저장해서   answer.add(1); 임의로 넣어줘야한다. 
           하지만 if문 마다 answer.add() 넣어주면  자동으로 1의 결과가 나온다.
        */
        List<Integer> answer = new ArrayList<>();
        while (n != 1) {
            answer.add(n);
            if (n % 2 == 0) {
               n = n / 2;
            } else {
               n = 3 * n + 1;
            } 
        }
        answer.add(1);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}