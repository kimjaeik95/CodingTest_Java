import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        while (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (cmd == 2) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (cmd == 3) {
                if (!deque.isEmpty()) {
                    bw.write(deque.pop() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            } else if (cmd == 4) {
                if (!deque.isEmpty()) {
                    bw.write(deque.pollLast() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            } else if (cmd == 5) {
                bw.write(deque.size() + "\n");
            } else if (cmd == 6) {
                if (deque.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (cmd == 7) {
                // 삼항연산자로 정리가능
                bw.write(deque.isEmpty() ? -1 + "\n" : deque.peek() + "\n");
            } else if (cmd == 8) {
                // 삼항연산자로 정리가능
                bw.write(deque.isEmpty() ? -1 + "\n" : deque.peekLast() + "\n");
            }
            n--;
        }
        bw.flush();
    }
}