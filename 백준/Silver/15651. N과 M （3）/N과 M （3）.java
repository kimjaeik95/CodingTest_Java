import java.io.*;
import java.util.*;

public class Main {
    static int[] s;
    static int n, m;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = new int[n];
        back(0);
        System.out.println(sb.toString());

    }

  
    private static void back(int length) {
        if (length == m) {
            printArray();
            return;
        }
        
        // 중복숫자를 제거  할 필요가 없음
        for (int i = 0; i < n; i++) {
            s[length] = i;
            back(length + 1);
        }


    }
    // sout 최악의 수 일때 출력이 많아지므로 StringBuilder 
    private static void printArray() {
        for (int i = 0; i < m; i++) {
            sb.append(s[i] + 1 + " ");
        }
        
        sb.append("\n");
    }
}