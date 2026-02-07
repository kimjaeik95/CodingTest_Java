import java.io.*;
import java.util.*;

public class Main {
    private static boolean[] visited;
    private static ArrayList<Integer>[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 노드 
        int m = Integer.parseInt(st.nextToken()); // 간선
        
        visited = new boolean[n + 1]; // 방문 배열 생성 
        
        a = new ArrayList[n + 1]; // 배열 생성
        for (int i = 1; i < n + 1; i++) {
            a[i] = new ArrayList<>(); // 인접 리스트 생성
        }
        
        // 인접 리스트 추가
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작 수 
            int e = Integer.parseInt(st.nextToken()); // 연결된 수 
            a[s].add(e); // 무방향 < -> 
            a[e].add(s); // 무방향 < ->
        }
        
        int count = 0; // 연결 횟수
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }
    
    private static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : a[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}