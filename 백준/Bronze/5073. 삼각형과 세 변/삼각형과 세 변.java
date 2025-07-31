import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            if (n == 0 && m == 0 && k == 0) {
                break;
            }
            
            int max = Math.max(n, Math.max(m,k));
            int sum = n + m + k - max;
            
            if (n == m && m == k) {
                bw.write("Equilateral\n");
            } else if (max >= sum) {
                bw.write("Invalid\n"); // 먼저 걸러내야함으로 앞에
            } else if (n != m && m != k && n != k) {
                bw.write("Scalene\n");
            } else if (n == m || m ==k || n == k) {
                bw.write("Isosceles\n");
            }
        }
        bw.flush();
    }
}
