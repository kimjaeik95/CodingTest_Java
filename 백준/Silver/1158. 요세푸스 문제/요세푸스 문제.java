import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // Queue<Integer> queue = new ArrayDeque<>(); 원형 뒤에 다시 삽입해야해서 채택X
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.listIterator();
        int result = 0;
        
        bw.write("<");
        while (!list.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (!iterator.hasNext()) {
                    iterator = list.listIterator(); // 커서 다시 처음으로 리셋
                }
                result = iterator.next();
            }
            
            iterator.remove();
            
            if (!list.isEmpty()) {
                bw.write(result + ", ");
            } else {
                bw.write(result + ">");
            }
        }
        
        bw.flush();
    }
}