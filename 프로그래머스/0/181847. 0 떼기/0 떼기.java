class Solution {
    public String solution(String n_str) {
        // answer = String.valueOf(Integer.parseInt(n_str));
        // Integer 숫자로 변하면 0은 문자열에 포함되지 않는다.
        String answer = "";
        int idx = 0;
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                // 0이 아닌 인덱스를 idx 담고 break 로 종료
                idx = i;  
                break;
            }
        }
        //  인데스 i부터 시작한문자열 
        answer = n_str.substring(idx);
        
        return answer;
    }
}