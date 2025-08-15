import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a1 = 0; int b1 = 0;
        int a2 = 0; int b2 = 0;
     
        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        b1 = Integer.parseInt(st.nextToken());
            
        st = new StringTokenizer(br.readLine());
        a2 = Integer.parseInt(st.nextToken());
        b2 = Integer.parseInt(st.nextToken());
                
        // 최소공배수
        int lcm = b1 / gcd(b1, b2) * b2;
        // 분자 합
        int max = a1 * (lcm / b1) + a2 * (lcm / b2);
        
        // 두 분수 합 최대공약수로 놔눠서 기약분수 만들기  (예 : 31 35는(1)  36 24(12) 최대공약수가 1이상은 기약분수아님)
        int gcd = gcd(max, lcm); // 합 분자와 분모 최대공약수 계산
        max = max / gcd; // 분자 GCD 놔누기 
        lcm = lcm / gcd; // 분모 GCD 놔누기 
        bw.write(max + " " + lcm);
        bw.flush();   
    }
    
    // 최대공약수
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

       