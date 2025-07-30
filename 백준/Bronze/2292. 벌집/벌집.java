import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int start = 1;
        int count = 1;
        
        // 6씩 증가할때마다 count++;
        while(n > start) {
            start += 6 * count;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}