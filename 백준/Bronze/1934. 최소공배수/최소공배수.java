import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] numbers = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers[i][0] = Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < n; i++) {
            int a = numbers[i][0];
            int b = numbers[i][1];
            int result = lcm(a, b);
            bw.write(result + "\n");
        }
        
        bw.flush();
    }
    
    // 최대공약수 0 되기전 값
    public static int gcd(int a, int b) {
        while (b != 0) { 
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 최대공배수
    public static int lcm(int a, int b) {
        return a / gcd(a,b) * b;
    }
}