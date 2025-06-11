import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        int answer = 0;
        // 처음에는 단순하게 Long 타입이면 될 줄 알았는데 범위가 넘어 서서 안되었다.
        // Long answer1 = Long.parseLong(number);
        // answer = (int) (answer1 % 9);
        // BigInteger 는 객체로 생성해야하며 기본타입이랑은 다르다.
        // 나머지를 구하는 메서드도 따로 있고  BigInteger 타입에 맞게 타입변환하는 메서드도 사용
        // 결과도 int값으로  intValue 형변환해줘야한다.
        BigInteger bigint = new BigInteger(number);
        BigInteger result = bigint.mod(BigInteger.valueOf(9));
        answer = result.intValue();
        return answer;
    }
}