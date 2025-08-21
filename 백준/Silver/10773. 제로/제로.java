import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < k; i++) {
            int cmd = Integer.parseInt(br.readLine());
            
            if (cmd != 0) {
                stack.push(cmd);
            } else {
                stack.pop();
            }
        }
        
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
}