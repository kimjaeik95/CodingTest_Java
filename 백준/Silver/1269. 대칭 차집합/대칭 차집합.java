import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<Integer> list1 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n; i++) {
            list1.add(Integer.parseInt(st.nextToken()));
        }
        
        Set<Integer> list2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            list2.add(Integer.parseInt(st.nextToken()));
        }
        
        // retainAll 두 Set 교집합을 구하고 (겹치지않는 수를 구하는 공식) 2는 “양쪽에서 겹친 요소가 한 번씩 포함되어 있다”
        // int count = (list1.size() + list2.size() -2 * intersection.size());
        int count = 0;
        for (int num : list2) {
            if (!list1.contains(num)) {
                count++;
            }
        }
        
        for (int num : list1) {
            if (!list2.contains(num)) {
                count++;
            }
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        
    }
}