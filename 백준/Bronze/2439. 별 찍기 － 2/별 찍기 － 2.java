import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {   // 5,4,3,2 >  1 공백
                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {  // 1 <= 1(i) 별 ->    1,2 <= 2(i)
                 bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}