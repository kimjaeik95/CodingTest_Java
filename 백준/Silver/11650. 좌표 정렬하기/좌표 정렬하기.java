import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][2]; // 고정되어있음


        for (int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[i][0] = Integer.parseInt(st.nextToken());
            board[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // sort 내부 정렬 알고리즘 (TimSort) 효율적인 정렬을 위해 여러 원소를 필요에 맞게 여러쌍 비교
        // 행이 5개라도 그 이상 비교할수도 있다.
        Arrays.sort(board, (a, b) -> {
            if (a[0] != b[0]) {
               return a[0] - b[0];  // 행 비교 값이 양수면 a가 뒤로
            } else {
                return a[1] - b[1];
            }
        });
        
        for (int i = 0; i < n; i++) {
            bw.write(board[i][0] + " " + board[i][1] + "\n");
        }
        
        bw.flush();
    }
}