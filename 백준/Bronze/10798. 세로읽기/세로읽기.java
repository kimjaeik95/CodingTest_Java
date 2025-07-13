import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        /* 어렵다고 느낀점 기존의 이중 for문 행 -> 열 탐방이아니라  세로  열 -> 행 헷갈렷다.
           문제에서 배열의 길이를 정해주지않아 char[5][] 열의 길이를 동적으로 받아야했다. 
           공백도 없어 열의 길이가 뒤죽박죽인 경우를 가려내야 했다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char[][] board = new char[5][]; // 열은 동적으로 받기위해
        int maxCol = 0;
        
        // 입력
        for (int i = 0; i < board.length; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }
        
        // 열 최대값 구하기
        for (int i = 0; i < board.length; i++) {
            maxCol = Math.max(maxCol, board[i].length);
        }
        
        
        for (int j = 0; j < maxCol; j++) {
            for (int i = 0; i < board.length; i++) {
                if (j < board[i].length) {  // 열의 수 체크해줘야한다.
                    sb.append(board[i][j]);
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}