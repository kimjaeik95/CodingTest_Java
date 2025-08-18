import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        // 구간 길이 구하기  인덱스1 - 인덱스0 -> 인덱스2 - 인덱스 1 -> 인덱스3 - 인덱스2
        List<Integer> gap = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            gap.add(numbers[i + 1] - numbers[i]);
        }
        // 총 최소간격 구하기
        int totalGap = gap.get(0);
        for (int i = 1; i < gap.size(); i++) {
            totalGap = gcd(totalGap, gap.get(i));
        }
        
        // 값  -1 양쪽 나무가 2개 존재하기때문에 해줘야한다.
        // 구간길이 + 최소간격 = 합  심어야할 값 
        // 추가할 나무 2개이상 나온다면 최소간격 * 최소간격  (예 7 + 2 * 2 = 11)
        int count = 0; 
        for (int i = 0; i < gap.size(); i++) {
            count += gap.get(i) / totalGap - 1;
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
    }
    
    public static int gcd(int n, int m) {
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}