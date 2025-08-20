import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            
            if (cmd == 4) {
                bw.write(stack.isEmpty() ? 1 + "\n" : 0 + "\n");
            } else if (cmd == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (cmd == 3) {
                bw.write(stack.size() + "\n");
            } else if (cmd == 2) {
                bw.write(stack.isEmpty() ? -1 + "\n" : stack.pop() + "\n");
            } else if (cmd == 5) {
                bw.write(stack.isEmpty() ? -1 + "\n" : stack.peek() + "\n");
            }
        }
        
        bw.flush();
    }
}

