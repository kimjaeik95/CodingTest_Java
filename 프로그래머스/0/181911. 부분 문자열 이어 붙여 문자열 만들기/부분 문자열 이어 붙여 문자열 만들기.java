class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // parts가 헷갈렸는데 parts[i] 첫번째 배열은 인덱스 쌍의 순번이고
        // parts[i][0] , parts[i][1]  인덱스 안에서의 배열 [0,4]  
        // 배열 인덱스가 2개인 0 ,1 이기 때문에
        // substring() end 인덱스는 포함 안하니까 + 1 해줘야 한다.
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            answer += my_strings[i].substring(start, end + 1); 
        }
        return answer;
    }
}