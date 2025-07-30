import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            
            if (numbers[i] == 1) {
                continue;  // 1은 소수가 아님으로 건너뛰어야한다.
            }
            
            // 999까지 검사 할 필요 없다. 자기 수 만큼만 약수 확인!
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}    