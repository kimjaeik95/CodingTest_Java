import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        
        // 피라미드로 쌓인 변을 구해야하는줄 알았지만 구할 필요가없었다.
        // for (int i = 0; i < n; i++) {
        //    m += n - i;
        // }
        
        // 둘레 = 4 × n 둘레 공하는 공식이 있다.
        long result = 4 * n; 
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
}