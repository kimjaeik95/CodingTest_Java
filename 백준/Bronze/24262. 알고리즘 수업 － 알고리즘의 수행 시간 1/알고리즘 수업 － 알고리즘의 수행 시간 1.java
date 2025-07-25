import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        //  MenOfPassion(A[], n) {
        //     i = ⌊n / 2⌋;  단한번만 실행한다.  for문 X
        //     return A[i]; 한번 출력
        // }
        
        long n = Integer.parseInt(br.readLine());
        // 단일 계산 
        bw.write("1\n");
        // 차수는 0~ 3“입력 크기에 따라 실행 횟수가 얼마나 늘어나는지”  O(1) -> 0(n)~(n3)
        bw.write("0");
        bw.flush();
    }
}