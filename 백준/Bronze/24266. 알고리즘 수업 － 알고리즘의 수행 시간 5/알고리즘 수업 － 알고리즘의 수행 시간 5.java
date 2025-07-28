import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine()); // 문제 잘 읽자..! int 초과
        
        bw.write(n * n * n + "\n"); // 삼중 for문 총 횟수
        bw.write("3\n");  // 삼중 for문 시간복잡도
        bw.flush();
    }
}