import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];
        int[] coins = {25,10,5,1};
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < c.length; i++) {
            int amount = c[i];
            for (int coin : coins) {
                int count = amount / coin;
                amount %= coin;
                bw.write(count + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}