import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        
        bw.write(String.valueOf(lcm(n, m)));
        bw.flush();
        
    }
    
    public static long gcd(Long n, Long m) {
        while(m != 0) {
            Long temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    
    public static long lcm(Long n, Long m) {
        return n / gcd(n, m) * m;
    }
}