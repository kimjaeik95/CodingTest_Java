import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;
        int tmp = 0;
        // 위에서 끝났으니 한번 더 호출해야함
        StringTokenizer st2 = new StringTokenizer(br.readLine()); 
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if (m >= sum && sum > tmp) {  // 낮은 수가 배열 뒤에도 있을 수 있으니 
                        tmp = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(tmp));
        bw.flush();
    }
}