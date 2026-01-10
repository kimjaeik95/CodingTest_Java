import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /*
         2초 2억번     N <=  1000   성적  음이아닌 정수 <= 100
         세개중 큰 점수 찾기
         과목총합 * 100 /max / n  평균 구하기
         */

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    
        int m = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (a[i] > m) {
                m = a[i];
            }
        }
        bw.write(String.valueOf(sum *100.0 /m/ n));
        bw.flush();
    }
}