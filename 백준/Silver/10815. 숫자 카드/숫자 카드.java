import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        // HastSet으로하면 순서가 정렬이 안된다. ArrayList로 비교하면 순서대로 비교해서 시간복잡도 증가
        // 순서가보장되는Set 해시함수 기반으로 시간복잡도 낮아진다. 
        Set<Integer> numbers = new LinkedHashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        Set<Integer> numbers2 = new LinkedHashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            numbers2.add(Integer.parseInt(st.nextToken()));
        }
      
        StringBuilder sb = new StringBuilder();
        for (int num : numbers2) {
            if (numbers.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        // 뒤에 마지막 공백제거
        sb.setLength(sb.length() -1);
        bw.write(sb.toString());
        bw.flush();
    }
}