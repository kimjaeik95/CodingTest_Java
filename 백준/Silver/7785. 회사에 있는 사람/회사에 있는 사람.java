import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 내림차순 정렬방법 1. new TreeSet<>(Comparator.reverseOrder());
        //2. List로 담고 sort    3. stream().sorted(내림차순).forEach(출력)    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Set<String> names = new HashSet<>();
        
        // 이름과 행동을 분리
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String name = st.nextToken();
            String action = st.nextToken();
            
            if (action.equals("enter")) {
                names.add(name);
            } else if (action.equals("leave")) {
                names.remove(name);
            }
         }
        
        // 정렬을 위해 List 담기
        List<String> sortNames = new ArrayList<>(names);
        sortNames.sort(Comparator.reverseOrder());
        
        for (String s : sortNames) {
            bw.write(s + "\n");
        }
        bw.flush();
    }
}