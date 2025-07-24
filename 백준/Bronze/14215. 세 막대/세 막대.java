import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] list = {a, b, c};
        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        int result = 0;
        if (list[0] + list[1] > list[2]) {
            result = list[0] + list[1] + list[2];
        } else {
            // a + b ≤ c라면 삼각형이 안 되니까, 가장 큰 변을 (a + b - 1)로 줄여야 삼각형이 된다.
            int max = list[0] + list[1];
            result = list[0] + list[1] - 1 + max;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}