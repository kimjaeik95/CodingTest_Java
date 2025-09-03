import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        int k = Integer.parseInt(br.readLine());
        
        // 시간복잡도 1초 이중For문 (N의2승 시간초과) -> O(N) Or NlogN
        // HashSet 보다 메모리가 적기때문에 (공간 복잡도)
        boolean[] check = new boolean[2000001];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int target = k - numbers[i];
            
            if (target > 0 && check[target]) {
                count++;
            }
            
            check[numbers[i]] = true;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}