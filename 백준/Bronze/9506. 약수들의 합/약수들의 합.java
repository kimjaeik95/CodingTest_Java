import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            
            List<Integer> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            
            // 약수 구하기
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                max += list.get(i);
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append(" + ");
                }
            }
                
                if (max == n) {
                    bw.write(n + " = " + sb + "\n");
                } else {
                    bw.write(n + " is NOT perfect.\n");
                }
            }
        bw.flush();
    }
}