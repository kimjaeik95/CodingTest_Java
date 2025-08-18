import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> name1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            name1.add(br.readLine());
        }
        
        Set<String> name2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            name2.add(br.readLine());
        }
        
        // 교집합만 남기기
        name1.retainAll(name2);
        
        List<String> result = new ArrayList<>(name1);
        
        //정렬  Collections.sort 같지만 객체에서바로 정렬
        result.sort(null);
        
        bw.write(result.size() + "\n");
       
        for (String s : result) {
            bw.write(s + "\n");
        }
        
        bw.flush();
    }
}
