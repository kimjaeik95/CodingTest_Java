import java.io.*;
import java.util.*;

public class Main {
    static int[] s;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        s = new int[m];

        back(0,0);

    }
    private static void back(int start, int length) {
        if (length == m) {
            printArray();
            return;
        }
        
        for (int i = start; i < n; i++) { // start로 사용 숫자 (기록 숫자 마지막 까지 볼 필요없다.)
            s[length] = i;
            back(i + 1, length + 1);
        }
        
    }
    
    private static void printArray() {
        for (int i = 0; i < m; i++) {
            System.out.print(s[i] + 1 + " ");
        }
        System.out.println();
    }
}