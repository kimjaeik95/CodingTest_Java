import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < n; i++) {
            strings.add(br.readLine());
        }
        
        // 검사 문자열 중복있을수 있음 입력즉시 바로 검사
        int count = 0;
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (strings.contains(s)) {
                count++;
            }
         }
       

        bw.write(String.valueOf(count));
        bw.flush();
    }
}