import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int x = 1; // 열 분모
        int y = 1; // 행 분자
        // 홀수는 오른쪽 위 , 짝수는 왼쪽아래쪽으로 내려가야함
        // 1/1은 무조건 첫번째로 되어야함
        while(n > 1) {
            if((x+y) % 2 == 0) {
                x++;
                if (y > 1) {
                    y--;
                }
            } else {
                if (x > 1) {
                    x--;
                }
                y++;
            }
            n--;
        }
        bw.write(y + "/" + x);
        bw.flush();
    }
}