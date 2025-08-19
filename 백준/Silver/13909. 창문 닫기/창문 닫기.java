import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        //  k=1 → 1번 사람: 1 1 1 1 1 1 1 1 1 1
        //  k=2 → 2번 사람: 1 0 1 0 1 0 1 0 1 0
        //  k=3 → 3번 사람: 1 0 0 0 1 1 1 0 0 0
        //  k=4 → 4번 사람: 1 0 0 1 1 1 1 1 0 0
        //  k=5 → 5번 사람: 1 0 0 1 0 1 1 1 0 1
        //  k=6 → 6번 사람: 1 0 0 1 0 0 1 1 0 1
        //  k=7 → 7번 사람: 1 0 0 1 0 0 0 1 0 1
        //  k=8 → 8번 사람: 1 0 0 1 0 0 0 0 0 1
        //  k=9 → 9번 사람: 1 0 0 1 0 0 0 0 1 1
        //  k=10 → 10번 사람: 1 0 0 1 0 0 0 0 1 0
        //  열린 창문 번호 = 제곱수  
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
      