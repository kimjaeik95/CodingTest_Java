import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        char c;
        int value = 0;
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            c = n.charAt(i);
            if (Character.isDigit(c)) {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            result += (int) (value * Math.pow(b, n.length() - 1 - i)); // 36  5 -1 +1 3 2 1
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
