import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        boolean found = false;
        
        for (int i = 1; i < n; i++) {
            int m;
            int sum = 0;
            String number = "";
            m = i;
            number = String.valueOf(i);
            
            for (char c : number.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            
                if (n == m + sum) {
                    bw.write(String.valueOf(m));
                    found = true;
                    break;
                }
            }
        if (!found) {
                bw.write("0");
            }
            bw.flush();
    }
}