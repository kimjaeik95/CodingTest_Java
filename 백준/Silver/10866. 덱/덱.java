import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd1 = st.nextToken();

            if ("push_back".equals(cmd1)) {
                int cmd2 = Integer.parseInt(st.nextToken());
                deque.addLast(cmd2);
            } else if ("push_front".equals(cmd1)) {
                int cmd2 = Integer.parseInt(st.nextToken());
                deque.addFirst(cmd2);
            } else if ("front".equals(cmd1)) {
                bw.write((!deque.isEmpty() ? String.valueOf(deque.peekFirst()) : "-1") + "\n");
            } else if ("back".equals(cmd1)) {
                bw.write((!deque.isEmpty() ? String.valueOf(deque.peekLast()) : "-1") + "\n");
            } else if ("size".equals(cmd1)) {
                bw.write(deque.size() + "\n");
            } else if ("empty".equals(cmd1)) {
                bw.write((deque.isEmpty() ? "1" : "0") + "\n");
            } else if ("pop_front".equals(cmd1)) {
                bw.write((!deque.isEmpty() ? String.valueOf(deque.removeFirst()) : "-1") + "\n");
            } else if ("pop_back".equals(cmd1)) {
                bw.write((!deque.isEmpty() ? String.valueOf(deque.removeLast()) : "-1") + "\n");
            }
        }
        bw.flush();
    }
}
