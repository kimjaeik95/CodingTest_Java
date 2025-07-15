import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int len = 0;
        int temp = n;
        char c;
        // 길이 구하기 
        while(temp > 0) {
            temp = temp / m;
            len++;
        }
   
    for (int i = len -1; i >= 0; i--) { //4  0 4 3 2 1 0
        int pow = (int) Math.pow(m, i);
        int digit = n / pow;
        n = n % pow;
        
        if (digit < 10) {
            c = (char) (digit + '0');
        } else {
         c = (char) (digit + 'A' - 10);
        }
        bw.write(c);
    }
    bw.flush();
  }
}