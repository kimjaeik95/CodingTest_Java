class Solution {
    public int solution(int n, String control) {
        // 초반에 헷갈렸다. 방향키 느낌으로 값을 누적해서 마지막 값
          for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 's') {
                n += -1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 'a') {
                n += -10;
            }
        }
        return n;
    }
}