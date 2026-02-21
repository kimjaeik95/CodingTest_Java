import java.io.*;
import java.util.*;

public class Main {
    static boolean[] v;
    static int[] s;
    static int n, m;
    public static void main(String[] args) throws IOException {
        /*
        백트래킹  1.  문제를 해결하기 위해 가능한 경로를 탐색
                2.  조건에 맞지않는 경로는 가지치기 탐색범위줄이기
              
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        s = new int[m];
        v = new boolean[n];
        back(0);
    }
    
    private static void back(int length) {
        if (length == m) {
            printArray();
            return;
        }
        
        for (int i = 0; i < n; i++) {  // 숫자 범위 돌기
            if (!v[i]) {
                v[i] = true;
                s[length] = i;
                back(length + 1);
                v[i] = false; 
            }
            
        }
    }
    
    private static void printArray() {
        for (int i = 0; i < m; i++) { // 깊이 인덱스 출력
            System.out.print(s[i] + 1 + " ");
        }
        System.out.println();
    }
}