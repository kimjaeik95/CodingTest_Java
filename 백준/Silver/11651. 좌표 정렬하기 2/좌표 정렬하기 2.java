import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static class Point {
        int y; // 행
        int x; // 열
        
        public Point (int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        // 이차원배열이 아닌 클래스로 작성해보았다.  객체지향
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            points[i] = new Point(y, x);
        }
        
        // 열 기준으로 정렬 열이 같으면 y 비교 정렬
        Arrays.sort(points, (a,b) -> {
            if (a.x != b.x) {
                return a.x - b.x;
            } else {
                return a.y - b.y;
            }
        });
        
        // 각 객체뽑기 
        for (int i = 0; i < n; i++) {
            bw.write(points[i].y + " " + points[i].x + "\n");
        }
        
        bw.flush();
    }
}