import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Integer[] list = new Integer[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        // Integer 타입이어야한다.
        Arrays.sort(list, Comparator.reverseOrder());
        
        int result = list[m - 1];
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
}