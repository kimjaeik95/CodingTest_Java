import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(s); // 정렬 꼭 필요 (예제는 정렬되어있어서 깜박함)
        
        for (int i = 0; i < n; i++) { // 검사 인덱스
            int left = 0;  // 검사때마다 초기화 
            int right = n - 1; 
            while(left < right) {
                if (i == left) { // 같은 인덱스 불가
                    left++;
                    continue;
                }
                
                if (i == right) { // 같은 인덱스 불가  오른쪽
                    right--;
                    continue;
                }
                if (s[i] == s[left] + s[right]) {
                    count++;
                    break;
                } else if (s[i] < s[left] + s[right]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
       