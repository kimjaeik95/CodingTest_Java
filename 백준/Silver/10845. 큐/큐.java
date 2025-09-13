import java.io.*;
import java.util.*;
class Queue {
    private int queueSize = 10000;
    private int[] queue;
    private int front = 0;
    private int near = 0;
    
    public Queue() {
        this.queue = new int[queueSize];
    }
    
    public void push(int value) {
        if (size() == queue.length) {
            System.out.println("큐 꽉 찼습니다."); 
        }
        queue[near++] = value;
    }
    
    public int pop() {
        if (front == near) {
            return -1;
        }
        return queue[front++];
    }
    
    public int back() {
        if (front == near) {
            return -1;
        }
        return queue[near - 1];
    }
    
    public int front() {
        if (front == near) {
            return -1;
        }
        return queue[front];
    }
    
    public int empty() {
        if (size() == 0) {
            return 1;
        }
        return 0;
    }
    
    public int size() {
        return near - front;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            switch (cmd) {
                
                case "push" :
                    String cmd1 = st.nextToken();
                    queue.push(Integer.parseInt(cmd1));
                    break;
                case "pop" : 
                    bw.write(queue.pop() + "\n");
                    break;
                case "back" : 
                    bw.write(queue.back() + "\n");
                    break;
                case "front" : 
                    bw.write(queue.front() + "\n");
                    break;
                case "empty" : 
                    bw.write(queue.empty() + "\n");
                    break;
                case "size" : 
                    bw.write(queue.size() + "\n");
                    break;
            }
        }
        
        bw.flush();

    }
}