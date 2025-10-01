import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;

        // deque 넣기
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= a; i++) {
            deque.add(i);
        }

        // cmd 맞게 왼쪽에서 뺄지 오른쪽에서 뺄지   1,3,4,6,7,8,10     2 + 2 +  4
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int cmd = Integer.parseInt(st.nextToken());
            int idx = ((LinkedList<Integer>) deque).indexOf(cmd);
            while (deque.peekFirst() != cmd) {
                if (idx <= deque.size() / 2) {  // Idx = 4  <= (5) 10/ 2  왼쪽에서 빼기
                    deque.addLast(deque.pollFirst());
                    count++;
                } else {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
