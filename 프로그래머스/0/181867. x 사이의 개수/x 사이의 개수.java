class Solution {
    public int[] solution(String myString) {
        //imit = 0 → "끝에 빈 문자열은 버려요"
        //limit = -1 → "끝까지 다 나눠요, 빈 문자열도 살려요"
        //limit = 양수 n → 최대 n-1번까지만 자르고 그 뒤는 합쳐요
        //자바에서 split() 기본 버전 (limit = 0)은 문자열 끝에 있는 빈 문자열은 버립니다!
        //limit = 1 한번으로  2 = 두번 = 3번 분할
        String[] array = myString.split("x", -1);
        int[] answer = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            answer[i] += array[i].length();
        }
        return answer;
    }
}