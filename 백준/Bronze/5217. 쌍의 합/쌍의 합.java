import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[] n = new int[a];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < n.length; i++) {
            bw.write("Pairs for " + n[i] + ":");  // 인덱스별 시작부분은 고정으로 써준다.
            boolean first = true;     // 또 숫자 조합이 있는지 확인용
            
            for (int j = 0; j < n[i]; j++) {  // 숫자 탐방
                for (int k = 0; k < n[i]; k++) {
                    if (j < k && j + k == n[i]) {  // 조합하지말아야 할 조건들 
                        if (!first) bw.write(",");  
                        bw.write(" " + j + " " + k);
                        first = false;  
                    }
                }
            }
            bw.newLine(); // 새글마다 줄 바꿈
        }
        bw.flush();
    }
}
