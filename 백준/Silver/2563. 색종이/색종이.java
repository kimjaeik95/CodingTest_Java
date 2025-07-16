import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] board = new int[100][100];
        int paperNumbers = Integer.parseInt(br.readLine());
        int[][] blackPaper = new int[paperNumbers][];
        
        // blackPaper[][] : 각 색종이의 (x, y) 좌표를 저장하는 2차원 배열입니다.
        // 기존의 2차원 배열과 다르게, 각 행은 한 색종이의 좌표 2개(x와 y)를 담고 있습니다.
        for (int i = 0; i < paperNumbers; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            blackPaper[i] = new int[2];
            blackPaper[i][0] = Integer.parseInt(st.nextToken());
            blackPaper[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // 각 색종이의 (x, y) 좌표를 기준으로 10x10 영역을 board에 표시 (1로 칠하기)
        for (int i = 0; i < paperNumbers; i++) {
            int x = blackPaper[i][0];
            int y = blackPaper[i][1];
            
            for (int row = y; row < y + 10; row++){
                for (int col = x; col < x + 10; col++) {
                    board[row][col] = 1;
                }
            }
        }
        
        //100x100 = 만개의보드판 1로 된 board 수 세기  
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j] == 1) {
                   area++; 
                }
            }
        }
        bw.write(String.valueOf(area));
        bw.flush();
    }
}