class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        // i = 1 로시작하는 이유는 첫번째인덱스는 값이뭔지 알 필요도없고 알 수도없다.
        for (int i = 1; i < numLog.length; i++) {
            // 이전값 -> 현재값 비교해야한다. i의 인덱스 값이랑 실제 배열 안의 값이 헷갈리지말자
            // numLog[1] = 1  numLog[0]  1 - 0  =  diff 는 1이다.
            // nubLog[2] = 0  numLog[1]  0 - 1  =  diff 는 -1 이다.
            // nubLog[3] = 10 numLog[2]  10 - 0 =  diff 는 +10이다.
            int diff = numLog[i] - numLog[i - 1];
            switch (diff) {
                case 1 : sb.append('w'); break;
                case -1 : sb.append('s'); break;
                case +10 : sb.append('d'); break;
                case -10 : sb.append('a'); break;
                    default : break;
            }
        }
        return sb.toString();
    }
}