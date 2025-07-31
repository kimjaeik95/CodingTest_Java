import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int max = 0;
        
        for (int i = n; i <= m; i++) {
            int count = 0; // 약수 카운트
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                max += i;
                list.add(i);
            }
        }
        
        if (max == 0) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(max + "\n");
            bw.write(String.valueOf(list.get(0)));
        }
        
        bw.flush();
    }
}