import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        // 각 변 추가 
        int size = (int) Math.pow(2,n) + 1;
        int result = size * size;
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
}