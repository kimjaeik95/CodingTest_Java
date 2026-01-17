import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int number = 1;
       
        for (int i = 0; i < n; i++) {
            int target = s[i];
            
            while (target >= number) {
                stack.push(number++);
                sb.append("+\n");
            }
            
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println(sb);
    }
}