import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
   
        // 새로운 케이스마다 Stack , isVpc 초기화해야하니 for문 안으로 까먹지말자 
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            boolean isVpc = true;
            String list = br.readLine();
                for (int j = 0; j < list.length(); j++) {
                    if (list.charAt(j) == '(') {
                        stack.push('(');
                    } else {
                        if (stack.isEmpty()) {
                            isVpc = false;
                            break;
                        }
                        stack.pop();
                    }
                }
        
            if (stack.isEmpty() && isVpc) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
