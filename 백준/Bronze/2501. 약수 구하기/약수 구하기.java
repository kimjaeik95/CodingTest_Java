import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 중복 X 순서 상관없음
        Set<Integer> temp = new HashSet<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp.add(i);
            }  
        }
        // 순서 정렬을 위해 
        List<Integer> list = new ArrayList<>(temp);
        Collections.sort(list);
        
        if (list.size() < m) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(list.get(m - 1)));
        }
        bw.flush();
    }
}