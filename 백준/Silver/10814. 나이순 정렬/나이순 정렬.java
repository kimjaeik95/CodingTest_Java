import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String[][] list = new String[n][2];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }
        
        Arrays.sort(list, (a, b) -> {
            if (!a[0].equals(b[0])) {
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            } else {
                return 0;
            }
        });
        
        for (int i = 0; i < n; i++) {
            bw.write(list[i][0] + " " + list[i][1] + "\n");
        }
        
        bw.flush();
    }
}