import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 1; 
        // 팩토리얼은 n! = 1~n번째까지 곱하는거다. 
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
}