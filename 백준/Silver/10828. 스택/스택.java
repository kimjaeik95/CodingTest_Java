import java.io.*;
import java.util.*;
class Stack {
    private int stackSize = 100000;
    private int[] stack;
    private int pos;
    
    public Stack() {
        this.stack = new int[stackSize];
        this.pos = 0;
    }
    
    public void push(int value) {
        if (size() >= stackSize) {
            System.out.println("스택이 꽉 찼습니다.");
        }
        stack[pos++] = value; 
    }
    
    public int pop() {
       if (empty() == 1) {
           return -1;
       }
       return stack[--pos];
    }
    
    public int top() {
        if (empty() == 1) {
            return -1;
        }
        return stack[pos - 1];
    }
     
    public int empty() {
        if (pos == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int size() {
        return pos;
    }
 }
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            if (cmd.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (cmd.equals("pop")) {
                bw.write(stack.pop() + "\n");
            } else if (cmd.equals("top")) {
                bw.write(stack.top() + "\n");
            } else if (cmd.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (cmd.equals("empty")) {
                bw.write(stack.empty() + "\n");
            }
        }
        
        bw.flush();
    }
}