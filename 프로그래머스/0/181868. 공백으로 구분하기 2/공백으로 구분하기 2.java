class Solution {
    public String[] solution(String my_string) {
        // 이건 GPT의 도움을 받았다...
        // 앞 뒤 공백이 있어서 trim()공백을 제거해주고
        // 불규칙하게 공백이있다. split(" ") 이렇게만으로는 공백두개를 처리하지못한다.
        // 이럴떄 필요한게 정규식이다 \\s+ 공백한개이상을 처리한다.
        return my_string.trim().split("\\s+");
    }
}