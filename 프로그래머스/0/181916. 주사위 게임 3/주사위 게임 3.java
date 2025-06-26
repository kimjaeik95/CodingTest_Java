class Solution {
    // 내 머리속으로는 이생각밖에 안난다.. 하지만 너무 불필요한 중복이많고 이걸 메서드로 놔눠야하는지
    // 다른 방식이 있는지좀 다른사람 코드좀 보고 다시 풀어봐야겠다 .. 
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0, q = 0, r = 0;

if (a == b && a == c && a == d) {
    answer = 1111 * a;

} else if (a == b && b == c && a != d) {
    p = a; q = d;
    answer = (10 * p + q) * (10 * p + q);

} else if (a == b && a == d && a != c) {
    p = a; q = c;
    answer = (10 * p + q) * (10 * p + q);

} else if (a == c && c == d && a != b) {
    p = a; q = b;
    answer = (10 * p + q) * (10 * p + q);

} else if (b == c && c == d && b != a) {
    p = b; q = a;
    answer = (10 * p + q) * (10 * p + q);
} else if (a == b && c == d) {
    // 두 쌍
    p = a; q = c;
    answer = (p + q) * Math.abs(p - q);

} else if (a == c && b == d) {
    p = a; q = b;
    answer = (p + q) * Math.abs(p - q);

} else if (a == d && b == c) {
    p = a; q = b;
    answer = (p + q) * Math.abs(p - q);

} else if (a == b && a != c && a != d && c != d) {
    // 두 개만 같은 경우
    q = c; r = d;
    answer = q * r;

} else if (a == c && a != b && a != d && b != d) {
    q = b; r = d;
    answer = q * r;

} else if (a == d && a != b && a != c && b != c) {
    q = b; r = c;
    answer = q * r;

} else if (b == c && b != a && b != d && a != d) {
    q = a; r = d;
    answer = q * r;

} else if (b == d && b != a && b != c && a != c) {
    q = a; r = c;
    answer = q * r;

} else if (c == d && c != a && c != b && a != b) {
    q = a; r = b;
    answer = q * r;

} else {
    // 모두 다른 경우
    answer = Math.min(Math.min(a, b), Math.min(c, d));
}
        return answer;
    }
}